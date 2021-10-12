package cn.gov.frame.beans.factory.support;

import cn.gov.frame.beans.factory.AbstractBeanFactory;
import cn.gov.frame.beans.factory.BeanDefinition;
import cn.gov.frame.beans.factory.BeansException;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:48 下午
 * @Email: hujinsheng005@cic.cn
 */
public class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        return bean;
    }

    @Override
    protected BeanDefinition getBeanDefinition(String name) {
        return null;
    }
}
