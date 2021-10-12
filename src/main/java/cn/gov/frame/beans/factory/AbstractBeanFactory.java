package cn.gov.frame.beans.factory;

import cn.gov.frame.beans.factory.support.DefaultSingletonBeanRegistry;

import java.util.Objects;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:33 下午
 * @Email: hujinsheng005@cic.cn
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory{
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if(Objects.nonNull(bean)){
            return bean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition);

    protected abstract BeanDefinition getBeanDefinition(String name);
}
