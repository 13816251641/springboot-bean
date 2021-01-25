package com.lujieni.bean.controller;

import com.lujieni.bean.entity.BaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private BaseDTO<Double> h2;

    @RequestMapping("/use-base-bean")
    public void useBaseBean(){
        System.out.println(h2.getT());
    }


}