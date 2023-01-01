package com.longyue.orvetimeservice.chapter;

import lombok.Data;

import java.util.List;

@Data
public class PdfText {
    private String text;
    private String imagePath;
    private boolean isImage = false;
}

