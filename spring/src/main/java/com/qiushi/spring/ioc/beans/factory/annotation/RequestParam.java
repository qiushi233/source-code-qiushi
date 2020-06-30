package com.qiushi.spring.ioc.beans.factory.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)// 作用在方法的参数上面
@Documented
public @interface RequestParam {
    String value() default "";
}