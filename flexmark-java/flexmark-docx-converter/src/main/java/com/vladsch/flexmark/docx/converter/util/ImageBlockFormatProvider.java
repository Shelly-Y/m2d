/**
 * Copyright (C), 2015-2020,phy.com
 * FileName: ImageBlockFormatProvider
 * Author:   lingyi
 * Date:     2020/12/30 15:29
 * Description:
 * History:
 */
package com.vladsch.flexmark.docx.converter.util;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lingyi
 * @create 2020/12/30
 * @since 1.0.0
 */
public class ImageBlockFormatProvider<T> extends BlockFormatProviderBase<T> {
    public ImageBlockFormatProvider(DocxContext<T> docx) {
        super(docx, docx.getRenderingOptions().IMAGE_STYLE);
    }
}
