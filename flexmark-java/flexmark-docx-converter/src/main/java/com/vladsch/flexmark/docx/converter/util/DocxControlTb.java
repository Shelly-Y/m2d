/**
 * Copyright (C), 2015-2021,phy.com
 * FileName: DocxControlTb
 * Author:   lingyi
 * Date:     2021/1/5 10:57
 * Description: 文档控制表格
 * History:
 */
package com.vladsch.flexmark.docx.converter.util;

import org.docx4j.XmlUtils;
import org.docx4j.wml.Document;

import javax.xml.bind.JAXBException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈文档控制表格〉
 *
 * @author lingyi
 * @create 2021/1/5
 * @since 1.0.0
 */
public class DocxControlTb {
    public static Object createDocxControlTb() throws JAXBException {

        String openXML =
                "<w:tbl mc:Ignorable=\"w14 wp14\" xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\" xmlns:a14=\"http://schemas.microsoft.com/office/drawing/2010/main\" xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\" xmlns:xml=\"http://www.w3.org/XML/1998/namespace\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" xmlns:wp=\"http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing\" xmlns:wp14=\"http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing\" xmlns:wps=\"http://schemas.microsoft.com/office/word/2010/wordprocessingShape\" xmlns:w14=\"http://schemas.microsoft.com/office/word/2010/wordml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">"
                        + "<w:tblPr>"
                        + "<w:tblW w:type=\"dxa\" w:w=\"8602\"/>"

                        + "<w:tblBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:insideH w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:insideV w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tblBorders>"

                        + "<w:tblLayout w:type=\"fixed\"/>"

                        + "<w:tblCellMar>"
                        + "<w:left w:type=\"dxa\" w:w=\"96\"/>"

                        + "<w:right w:type=\"dxa\" w:w=\"96\"/>"

                        + "</w:tblCellMar>"

                        + "<w:tblLook w:firstColumn=\"0\" w:firstRow=\"0\" w:lastColumn=\"0\" w:lastRow=\"0\" w:noHBand=\"0\" w:noVBand=\"0\" w:val=\"0000\"/>"

                        + "</w:tblPr>"

                        + "<w:tblGrid>"
                        + "<w:gridCol w:w=\"947\"/>"

                        + "<w:gridCol w:w=\"1276\"/>"

                        + "<w:gridCol w:w=\"850\"/>"

                        + "<w:gridCol w:w=\"1134\"/>"

                        + "<w:gridCol w:w=\"992\"/>"

                        + "<w:gridCol w:w=\"1843\"/>"

                        + "<w:gridCol w:w=\"1560\"/>"

                        + "</w:tblGrid>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "<w:trHeight w:val=\"555\"/>"

                        + "<w:tblHeader/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>版本号</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>日期</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>作者</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>段落、图或表</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>增加</w:t>"

                        + "</w:r>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>/</w:t>"

                        + "</w:r>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>修改</w:t>"

                        + "</w:r>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>/</w:t>"

                        + "</w:r>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>删除</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>简单描述</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"2\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct10\"/>"

                        + "<w:vAlign w:val=\"center\"/>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--1\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "<w:r>"
                        + "<w:rPr>"
                        + "<w:rFonts w:hint=\"eastAsia\"/>"

                        + "<w:lang w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "<w:t>更改申请单号</w:t>"

                        + "</w:r>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "<w:trHeight w:hRule=\"exact\" w:val=\"60\"/>"

                        + "<w:tblHeader/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:val=\"nil\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:val=\"nil\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:val=\"nil\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:val=\"nil\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:val=\"nil\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:val=\"nil\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:val=\"nil\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:val=\"nil\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:val=\"nil\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:val=\"nil\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:val=\"nil\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:val=\"nil\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "<w:shd w:color=\"auto\" w:fill=\"auto\" w:val=\"pct50\"/>"

                        + "</w:tcPr>"

                        + "<w:p/>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "</w:tr>"

                        + "<w:tr>"
                        + "<w:trPr>"
                        + "<w:cantSplit/>"

                        + "</w:trPr>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"947\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1276\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"850\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1134\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"992\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1843\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"

                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"

                        + "</w:rPr>"

                        + "</w:pPr>"

                        + "</w:p>"

                        + "</w:tc>"

                        + "<w:tc>"
                        + "<w:tcPr>"
                        + "<w:tcW w:type=\"dxa\" w:w=\"1560\"/>"

                        + "<w:tcBorders>"
                        + "<w:top w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:left w:color=\"auto\" w:space=\"0\" w:sz=\"6\" w:val=\"single\"/>"

                        + "<w:bottom w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "<w:right w:color=\"auto\" w:space=\"0\" w:sz=\"12\" w:val=\"single\"/>"

                        + "</w:tcBorders>"

                        + "</w:tcPr>"

                        + "<w:p>"
                        + "<w:pPr>"
                        + "<w:pStyle w:val=\"C503--5\"/>"
                        + "<w:rPr>"
                        + "<w:lang w:eastAsia=\"zh-CN\" w:val=\"en-US\"/>"
                        + "</w:rPr>"
                        + "</w:pPr>"
                        + "</w:p>"
                        + "</w:tc>"
                        + "</w:tr>"
                        + "</w:tbl>"
                        ;

        Object document = XmlUtils.unmarshalString(openXML);
        return document;
    }
    public DocxControlTb() throws JAXBException {}
}
