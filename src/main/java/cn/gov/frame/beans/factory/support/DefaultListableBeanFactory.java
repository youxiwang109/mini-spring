package cn.gov.frame.beans.factory.support;

import cn.gov.frame.beans.factory.BeanDefinition;
import cn.gov.frame.beans.factory.BeanDefinitionRegistry;
import cn.gov.frame.beans.factory.BeansException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/13 3:22 下午
 * @Email: hujinsheng005@cic.cn
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.putIfAbsent(beanName,beanDefinition);
    }


    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null){
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }

        return beanDefinition;
    }
}
