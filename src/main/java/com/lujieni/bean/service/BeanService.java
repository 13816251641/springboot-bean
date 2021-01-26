package com.lujieni.bean.service;

import com.lujieni.bean.entity.BaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanService {

    /*
       1.
          @Autowired
          private BaseDTO baseDTO;
          先根据BaseDTO类型找合适的bean,有3个;
          再根据baseDTO区分,但三个分别叫h1&h2&h3无法区分所以报错;

       2.
          @Autowired
          private BaseDTO<String> baseDTO;
          如果泛型和非泛型都满足条件,优先匹配正确的泛型,其次是非泛型,非泛型也能匹配到;
          这里存在BaseDTO<String>所以会被优先匹配

       3.
          @Autowired
          private BaseDTO<Double> baseDTO;
          这里没有Double类型的泛型,但是退而求其次有BaseDTO baseDTO的非泛型,所以匹配非泛型。
          但是我们使用这个泛型的时候要小心,因为它不是Double类型的,具体可以见HelloController
          中的示例
     */

    @Autowired
    private BaseDTO<Double> h2;

}