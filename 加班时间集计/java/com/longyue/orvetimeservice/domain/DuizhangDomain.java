package com.longyue.orvetimeservice.domain;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class DuizhangDomain {
    private String jg;
    private Integer ydz;
    private Integer wdz;
    private BigDecimal dzl;
}
