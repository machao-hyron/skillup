package com.longyue.orvetimeservice.chapter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PdfSection {
    private String title;

    /**
     * 否带序号 设值=1 表示带序号 1.章节一；1.1小节一...，设值=0表示不带序号
     */
    private int depth = 1;

    private List<PdfText> pdfTexts = new ArrayList<>();
}

