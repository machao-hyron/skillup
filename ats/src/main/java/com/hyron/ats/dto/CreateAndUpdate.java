package com.hyron.ats.dto;

import com.hyron.ats.config.CreateTime;
import com.hyron.ats.config.CreateUserId;
import com.hyron.ats.config.UpdateTime;
import com.hyron.ats.config.UpdateUserId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract  class CreateAndUpdate implements Serializable {

    @CreateTime
    private Date createTime;

    @UpdateTime
    private Date updateTime;

    @CreateUserId
    private String createUserId;

    @UpdateUserId
    private String updateUserId;

}
