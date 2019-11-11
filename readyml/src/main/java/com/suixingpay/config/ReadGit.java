package com.suixingpay.config;

import com.suixingpay.pojo.GitPojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author:muziru
 * @date:2019/11/07
 * @version:v1.0
 */
@Configuration
@Slf4j
public class ReadGit {
        @Autowired
        public GitPojo gitPojo;

        @Bean
        public void readInfomation() {
            if (gitPojo != null)
                System.out.println(gitPojo.toString());
            else {
                System.out.println("文件夹为空");
            }
        }
    }


