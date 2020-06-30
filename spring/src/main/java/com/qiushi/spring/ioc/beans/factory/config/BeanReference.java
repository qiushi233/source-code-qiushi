package com.qiushi.spring.ioc.beans.factory.config;

/**
 * 包装属性依赖中的引用类型
 */
public class BeanReference {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
