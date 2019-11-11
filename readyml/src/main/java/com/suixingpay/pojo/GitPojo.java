package com.suixingpay.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:muziru
 * @date:2019/11/07
 * @version:v1.0
 */
@Data
@Component
@PropertySource(value = {"file:C:\\Users\\smallBottle\\Desktop\\test11_11\\readyml\\src\\main\\resources\\git.yml"}, ignoreResourceNotFound =true)
public class GitPojo {
        @Value("${git.branch}")
        private String branch;
        @Value("${git.commit.id}")
        private String gitCommitId;
        @Value("${git.remote.origin.url}")
        private String gitUrl;
        @Value("${git.commit.time}")
        private String buildDate;
        @Value("${git.commit.id.abbrev}")
        private String commitIdShort;

        @Override
        public String toString() {
                return "GitPojo{" +
                        "branch='" + branch + '\'' +
                        ", gitCommitId='" + gitCommitId + '\'' +
                        ", gitUrl='" + gitUrl + '\'' +
                        ", buildDate='" + buildDate + '\'' +
                        ", commitIdShort='" + commitIdShort + '\'' +
                        '}';
        }
}
