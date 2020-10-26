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
          泛型和非泛型都满足条件,会报异常

       2.
          @Autowired
          private BaseDTO<String> baseDTO;
          如果泛型和非泛型都满足条件,优先匹配正确的泛型,其次是非泛型,非泛型也能匹配到

       3.
          @Autowired
          private BaseDTO<Double> baseDTO;
          如果泛型和非泛型都满足条件,优先匹配正确的泛型,其次是非泛型,这里没有Double的泛型,但有非泛型会被匹配所以也OK
     */

    @Autowired
    private BaseDTO<Double> baseDTO;


}