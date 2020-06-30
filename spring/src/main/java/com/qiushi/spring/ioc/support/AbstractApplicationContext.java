package com.qiushi.spring.ioc.support;

import com.qiushi.spring.ioc.beans.factory.BeanFactory;
import com.qiushi.spring.ioc.context.ApplicationContext;

public abstract class AbstractApplicationContext implements ApplicationContext {

    protected BeanFactory beanFactory;

    public AbstractApplicationContext(String location) {
        this.beanFactory = new AnnotationBeanFactory(location);
    }

    @Override
    public Object getBean(String beanName) throws Exception {
        return beanFactory.getBean(beanName);
    }

}
