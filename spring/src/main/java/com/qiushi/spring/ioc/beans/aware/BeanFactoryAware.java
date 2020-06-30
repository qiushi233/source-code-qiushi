package com.qiushi.spring.ioc.beans.aware;

import com.qiushi.spring.ioc.beans.factory.BeanDefinitionRegistry;

/**
 * 让Bean获取配置他们的BeanFactory的引用
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanDefinitionRegistry beanDefinitionRegistry);
}
