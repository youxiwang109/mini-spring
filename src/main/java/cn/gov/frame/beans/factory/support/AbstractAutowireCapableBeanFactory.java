package cn.gov.frame.beans.factory.support;

import cn.gov.frame.beans.factory.BeanDefinition;
import cn.gov.frame.beans.factory.BeansException;

import java.beans.Beans;
import java.lang.reflect.Constructor;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:48 下午
 * @Email: hujinsheng005@cic.cn
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    private InstantiationStrategy instantiationStrategy = new CiglibInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        try {

            Constructor constructorToUse = null;
            Class<?> beanClass = beanDefinition.getBeanClass();
            Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
            for (Constructor ctor : declaredConstructors) {
                if (null != args && ctor.getParameterTypes().length == args.length) {
                    constructorToUse = ctor;
                    break;
                }
            }
            bean = getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);

        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
