package com.longyue.orvetimeservice.service;

import com.dtflys.forest.annotation.PostRequest;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;

@Service
public interface GetPdfFile {
    @PostRequest("http://127.0.0.1:8080//createPdfFile")
    InputStream postPdf(Map<String, Object> params);
}
