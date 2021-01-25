package com.lujieni.bean.bean;

import com.lujieni.bean.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Bean和@Value标签如果没有@Configuration标签支持的话将会失效
 *
 * @Auther ljn
 * @Date 2019/11/5
 */
@Configuration
public class UseBean {

    private String name = "mc";//麦当劳

    @Value("${name}")
    private void setAll(String hiv){
        name = hiv;// name:mc->kfc
    }


    /**
       利用@Qualifier标签也可以区分同一个类型的不同实例
    */
    @Bean
    public String useStudent1(@Qualifier("y") Student s){
        System.out.println(name);//kfc
        System.out.println(s.getName());
        return "hello";
    }

    /**
        利用Student s 指定入参字段名字也可以指定bean
     */
    @Bean
    public String useStudent2(Student s){
        System.out.println(s.getName());
        return "hello";
    }

}
