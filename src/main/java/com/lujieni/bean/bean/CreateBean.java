package com.lujieni.bean.bean;

import com.lujieni.bean.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther ljn
 * @Date 2020/2/14
 */
@Configuration
public class CreateBean {

    @Bean("y")
    public Student y(){
        Student y = new Student();
        y.setName("y");
        return y;
    }

    @Bean("s")
    public Student s(){
        Student s = new Student();
        s.setName("s");
        return s;
    }


}
