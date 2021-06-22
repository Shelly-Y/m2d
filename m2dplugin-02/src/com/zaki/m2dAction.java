/**
 * Copyright (C), 2015-2021,phy.com
 * FileName: m2dAction
 * Author:   lingyi
 * Date:     2021/3/11 15:00
 * Description:
 * History:
 */
package com.zaki;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.vladsch.flexmark.java.samples.DocxConverterEmpty;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.jetbrains.annotations.NotNull;

import javax.xml.bind.JAXBException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lingyi
 * @create 2021/3/11
 * @since 1.0.0
 */
public class m2dAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
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
        try {
            DocxConverterEmpty.DocxConvert(actionDir,outputDir+"\\a.docx");
        } catch (InvalidFormatException ex) {
            ex.printStackTrace();
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        String title = "转换完成";

        //显示对话框
        Messages.showMessageDialog(project, actionDir, title, Messages.getInformationIcon());

    }
}
