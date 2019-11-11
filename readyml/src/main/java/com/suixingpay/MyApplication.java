package com.suixingpay;

import com.suixingpay.annotation.GitAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author:muziru
 * @date:2019/11/07
 * @version:v1.0
 */
@SpringBootApplication
@GitAnnotation
public class MyApplication {

    public static void  main(String[] args){

        SpringApplication.run(MyApplication.class,args);

    }

}
