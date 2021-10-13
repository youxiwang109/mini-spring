package cn.gov.frame.beans.factory;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/13 3:24 下午
 * @Email: hujinsheng005@cic.cn
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String name,BeanDefinition beanDefinition);
}
