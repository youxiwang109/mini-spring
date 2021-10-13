package cn.gov.frame.beans.factory.support;

import cn.gov.frame.beans.factory.BeanDefinition;
import cn.gov.frame.beans.factory.BeanFactory;
import cn.gov.frame.beans.factory.BeansException;
import cn.gov.frame.beans.factory.support.DefaultSingletonBeanRegistry;

import java.util.Objects;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:33 下午
 * @Email: hujinsheng005@cic.cn
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }



    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;


    private Object doGetBean(String beanName, Object[] args) {
        Object bean = getSingleton(beanName);
        if (Objects.nonNull(bean)) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }
}
