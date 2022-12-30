package com.longyue.orvetimeservice.config;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.longyue.orvetimeservice.chapter.PdfChapter;
import com.longyue.orvetimeservice.chapter.PdfSection;
import com.longyue.orvetimeservice.chapter.PdfText;
import com.longyue.orvetimeservice.exception.MyAppRunException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;


/**
 * pdf工具类，主要是实现了导出功能。
 * 使用itextpdf包实现
 */
@Component
public class PdfUtil {
 
    private static final Logger logger = LoggerFactory.getLogger(PdfUtil.class);
 
    // pdf大小，设置为A4纸大小
    public static final Rectangle PAGE_SIZE = PageSize.A4;
    // 设置内容距离纸张上右下左的距离
    public static final float MARGIN_LEFT = 50;

    public static final float MARGIN_RIGHT = 50;
    public static final float MARGIN_TOP = 50;
    public static final float MARGIN_BOTTOM = 50;
    // 空格的间距大小
    public static final float SPACING = 20;
    // 标题对齐方式： 0表示left，1表示center
    public static final int TITLE_ALIGNMENT = 1;
 
         
    private static volatile PdfUtil instance = null;
    // pdf文档
    private Document document = null;
    //文章标题字体
    private Font _chapterFont = null;
    //小节标题字体
    private Font _sectionFont = null;
    //内容字体
    private Font _textFont = null;
 
    private PdfUtil() {
    }
 
    //DCL  (Double Check Lock 双端捡锁机制）
    public static PdfUtil getInstance() {
        if (instance == null) {
            synchronized (PdfUtil.class) {
                if (instance == null) {
                    instance = new PdfUtil();
                }
            }
        }
        return instance;
    }
 
    /**
     * 初始化字体
     */
    public PdfUtil init() {
        // 默认设置
        _chapterFont = createFont(20, Font.BOLD, new BaseColor(0, 0, 255));
        _sectionFont = createFont(16, Font.BOLD, new BaseColor(0, 0, 255));
        _textFont = createFont(10, Font.NORMAL, new BaseColor(0, 0, 0));
        return instance;
    }
 
    /**
     * 初始化字体
     */
    protected PdfUtil init(Font chapterFont, Font sectionFont, Font textFont) {
        // 使用自定义的字体
        _chapterFont = chapterFont;
        _sectionFont = sectionFont;
        _textFont = textFont;
        return instance;
    }
 
    /**
     * 创建pdf文件
     *
     * @param fileName 文件（全路径文件名）
     */
    public PdfUtil create(String fileName) {
        File file = new File(fileName);
        document = new Document(PAGE_SIZE, MARGIN_LEFT, MARGIN_RIGHT, MARGIN_TOP, MARGIN_BOTTOM);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            PdfWriter.getInstance(document, out);
        } catch (FileNotFoundException e) {
            logger.error("创建pdf文件异常", e);
        } catch (DocumentException e) {
            logger.error("创建pdf文件错误", e);
        }
        // 打开文档准备写入内容
        document.open();
        return instance;
    }
 
    public PdfUtil chapters(List<PdfChapter> pdfChapters) {
        try {
            for (PdfChapter pdfChapter : pdfChapters) {
                Chapter chapter = writeChapter(pdfChapter);
                for (PdfSection pdfSection : pdfChapter.getSections()) {
                    Section section = writeSection(chapter, pdfSection);
                    for (PdfText pdfText : pdfSection.getPdfTexts()) {
                        if(pdfText.isImage()){
                            writeImage(pdfText.getImagePath());
                        }
 
                        if(pdfText.getText() != null){
                            section.add(writePhrase(pdfText.getText()));
                        }
                    }
                }
                document.add(chapter);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return instance;
    }
 
    public void build(){
        closeDocument();
    }
 
    /**
     * 写章节
     *
     * @param pdfChapter
     */
    private Chapter writeChapter(PdfChapter pdfChapter) {
        Paragraph chapterTitle = new Paragraph(pdfChapter.getTitle(), _chapterFont);
        chapterTitle.setAlignment(TITLE_ALIGNMENT);
        Chapter chapter = new Chapter(chapterTitle, pdfChapter.getOrder());
        chapter.setNumberDepth(pdfChapter.getDepth());
        return chapter;
    }
 
    /**
     * 写片段
     *
     * @param chapter
     * @param pdfSection
     * @return
     */
    private Section writeSection(Chapter chapter, PdfSection pdfSection) {
        Section section = null;
        if (chapter != null) {
            Paragraph sectionTitle = new Paragraph(pdfSection.getTitle(), _sectionFont);
            sectionTitle.setSpacingBefore(SPACING);
            section = chapter.addSection(sectionTitle);
            section.setNumberDepth(pdfSection.getDepth());
        }
        return section;
    }
 
    /**
     * 写内容
     *
     * @param text
     */
    private Phrase writePhrase(String text) {
        return new Paragraph(text, _textFont);
    }
 
    /**
     * 写图片
     *
     * @param image
     */
    private void writeImage(String image) {
        try {
            //图片1
            Image image1 = Image.getInstance(image);
            //将图片1添加到pdf文件中
            document.add(image1);
        } catch (IOException e) {
            logger.error("写入图片异常", e);
        } catch (DocumentException e) {
            logger.error("写入图片错误", e);
        }
    }
 
    /**
     * 功能： 返回支持中文的字体---仿宋
     * <p>
     * simfang.ttf 仿宋常规
     * <p>
     * simhei.ttf 黑体常规
     *
     * @param size  字体大小
     * @param style 字体风格
     * @param color 字体 颜色
     * @return 字体格式
     */
    private Font createFont(float size, int style, BaseColor color) {
        BaseFont baseFont = null;
        try {
            // simfang.ttf文件必须放在class类文件所有的包路径下
            URL resource = PdfUtil.class.getClassLoader().getResource("simFang.ttf");
            if (resource == null) {
                throw new MyAppRunException("无simfang.ttf字体文件");
            }
            String path = resource.getPath();
            path =  URLDecoder.decode(path,"utf-8");
            logger.info("加载simfang.ttf字体， 路径：{}", path);
            baseFont = BaseFont.createFont(path, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (DocumentException e) {
            logger.error("加载字体错误", e);
        } catch (IOException e) {
            logger.error("加载字体错误", e);
        }
        return new Font(baseFont, size, style, color);
    }
 
    /**
     * 最后关闭PDF文档
     */
    private void closeDocument() {
        if (document != null) {
            // 执行关闭时文件会自动保存
            document.close();
            logger.info("文件已保存");
        }
    }
 
}
