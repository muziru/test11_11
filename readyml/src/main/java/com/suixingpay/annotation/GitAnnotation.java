package com.suixingpay.annotation;

import com.suixingpay.config.ReadGit;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description:
 * @author:muziru
 * @date:2019/11/07
 * @version:v1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(ReadGit.class)
public @interface GitAnnotation {
}
