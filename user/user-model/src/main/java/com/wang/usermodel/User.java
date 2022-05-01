package com.wang.usermodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String id;
    private String userNo;
    private String userName;
}
