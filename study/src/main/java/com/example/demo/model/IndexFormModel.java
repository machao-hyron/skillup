package com.example.demo.model;


import com.example.demo.entity.TUserInfo;
import lombok.Data;

import java.util.List;

@Data
public class IndexFormModel {

    private String username;

    private List<TUserInfo> userInfos;
}
