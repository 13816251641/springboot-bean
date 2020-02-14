package com.lujieni.bean.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Student {
    private Integer age = 27;
    private String name = "王虎";
    private Date date;
}
