package com.zaki;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.vladsch.flexmark.docx.converter.DocxRenderer;
import com.vladsch.flexmark.docx.converter.util.Docx4JUtils;
import com.vladsch.flexmark.docx.converter.util.Foo;
import com.vladsch.flexmark.ext.aside.AsideExtension;
import com.vladsch.flexmark.ext.definition.DefinitionExtension;
import com.vladsch.flexmark.ext.emoji.EmojiExtension;
import com.vladsch.flexmark.ext.footnotes.FootnoteExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughSubscriptExtension;
import com.vladsch.flexmark.ext.ins.InsExtension;
import com.vladsch.flexmark.ext.superscript.SuperscriptExtension;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.ext.toc.SimTocExtension;
import com.vladsch.flexmark.ext.toc.TocExtension;
import com.vladsch.flexmark.ext.wikilink.WikiLinkExtension;
import com.vladsch.flexmark.java.samples.DocxConverterEmpty;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import org.docx4j.Docx4J;
import org.docx4j.model.structure.PageSizePaper;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.relationships.Relationship;

import javax.xml.bind.JAXBException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m2dAction extends AnAction {
    final private static DataHolder OPTIONS = new MutableDataSet()
            .set(Parser.EXTENSIONS, Arrays.asList(
                    AsideExtension.create(),
                    DefinitionExtension.create(),
                    EmojiExtension.create(),
                    FootnoteExtension.create(),
                    StrikethroughSubscriptExtension.create(),
                    InsExtension.create(),
                    SuperscriptExtension.create(),
                    TablesExtension.create(),
                    TocExtension.create(),
                    SimTocExtension.create(),
                    WikiLinkExtension.create()
            ))
            .set(DocxRenderer.SUPPRESS_HTML, true)
            // the following two are needed to allow doc relative and site relative address resolution
            .set(DocxRenderer.DOC_RELATIVE_URL, "image/..") // this will be used for URLs like 'images/...' or './' or '../'
            //.set(DocxRenderer.DOC_ROOT_URL, "image/..") // this will be used for URLs like: '/...'
            ;

    public static List getFiles(String path) {
        List list = new ArrayList();
        File[] files = new File(path).listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                List node = getFiles(files[i].getPath());
                list.addAll(node);
            } else {
                list.add(files[i].getPath());
            }
        }
        return list;
    }


    /**
     * 合并文件
     *
     * @param inPath
     * @param outPath
     * @throws IOException
     */
    public static String mergeFileToOne(String inPath, String outPath) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(outPath));
        String markdown = "";
        // System.out.println("--->合并目标文件夹路径：" + inPath);
        // System.out.println("--->正在读取文件...");
        List<String> files = getFiles(inPath);
        // System.out.println("--->合并文件数量：" + files.size());
        for (int i = 0; i < files.size(); i++) {
            File file = new File(files.get(i));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                markdown += line + "\n";
            }
            bufferedReader.close();
        }
        //  System.out.println("--->合并完成！");
        // System.out.println("--->合并文件输出路径：" + outPath);
        bw.close();
        return markdown;
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        // TODO: insert action logic here

        //获取当前在操作的工程上下文

        Project project = e.getProject();
        /**
         * 从Action中得到一个虚拟文件
         */
        VirtualFile virtualFile = e.getData(DataKeys.VIRTUAL_FILE);
        if (!virtualFile.isDirectory()) {
            virtualFile = virtualFile.getParent();
        }
        // 获取路径
        String actionDir = virtualFile.getPath();
        String outputDir = virtualFile.getParent().getPath();

        // 合并
        String markdown = "";
        try {
            markdown = mergeFileToOne(actionDir, outputDir);
        } catch (IOException en) {
            en.printStackTrace();
        }
        //   System.out.println("markdown\n");
        //  System.out.println(markdown);

        Parser PARSER = Parser.builder(OPTIONS).build();
        DocxRenderer RENDERER = DocxRenderer.builder(OPTIONS).build();
        assert markdown != null;
        Node document = PARSER.parse(markdown);
        //遍历节点并打印
        //  System.out.println(new AstCollectingVisitor().collectAndGetAstText(document));


        // or to control the package

        WordprocessingMLPackage template = DocxRenderer.getDefaultTemplate();

        DocxRenderer.setPageSize(template, PageSizePaper.A4, false);
        try {
            template.getMainDocumentPart().addObject(Foo.createTb(" "));
            template.getMainDocumentPart().getContent().add(Foo.createDocxControlTbP1());
            template.getMainDocumentPart().getContent().add(Foo.createDocxControlTbP2());
            template.getMainDocumentPart().getContent().add(Foo.createDocxControlTb());
            Docx4JUtils.addTableOfContent(template.getMainDocumentPart());
            Relationship relationship = Docx4JUtils.createFooterPart(template);
            Docx4JUtils.createFooterReference(template, relationship);
        } catch (JAXBException | InvalidFormatException ex) {
            ex.printStackTrace();
        }

        RENDERER.render(document, template);

        File file = new File(outputDir);

        try {
            template.save(file, Docx4J.FLAG_SAVE_ZIP_FILE);

        } catch (Docx4JException ea) {
            ea.printStackTrace();
        }



    String title = "转换完成";

    //显示对话框
        Messages.showMessageDialog(project,actionDir,title,Messages.getInformationIcon());

}
}
