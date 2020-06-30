package com.qiushi.spring.ioc.beans.factory.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})// 作用在类和方法
@Documented
public @interface RequestMapping {
    String value() default "";
}
