package com.ery.dubbo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Integer uid;

    private String username;

    private String password;

}
