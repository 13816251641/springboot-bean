package com.lujieni.bean.bean;

import com.lujieni.bean.entity.BaseDTO;
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

    /**********************************创建不同泛型类型的BaseDTO************************************/

    @Bean
    public BaseDTO<String> h1(){
        BaseDTO<String> baseDTO = new BaseDTO<>();
        baseDTO.setT("hello");
        return baseDTO;
    }

    @Bean
    public BaseDTO<Integer> h2(){
        BaseDTO<Integer> baseDTO = new BaseDTO<>();
        baseDTO.setT(123);
        return baseDTO;
    }

    @Bean
    public BaseDTO h3(){
        BaseDTO baseDTO = new BaseDTO();
        baseDTO.setT(13L);
        return baseDTO;
    }


}
