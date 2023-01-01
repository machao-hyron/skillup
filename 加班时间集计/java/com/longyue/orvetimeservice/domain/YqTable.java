package com.longyue.orvetimeservice.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@Accessors(chain = true)
public class YqTable implements Serializable {
    private String jg;
    private Integer yqs;
}
