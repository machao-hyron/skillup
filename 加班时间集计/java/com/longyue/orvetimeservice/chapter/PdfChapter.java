package com.longyue.orvetimeservice.chapter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class PdfChapter {
    private String title;

    /**
     * 章节序列号
     */
    private int order;

    /**
     * 章节的层级深度 设值=1 表示带序号 1.章节一；1.1小节一...，设值=0表示不带序号
     */
    private int depth = 0;

    private List<PdfSection> sections = new ArrayList<>();
}
