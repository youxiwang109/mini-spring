package cn.gov.frame.beans.factory.support;

import cn.gov.frame.beans.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/13 3:51 下午
 * @Email: hujinsheng005@cic.cn
 */
public class CiglibInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) {
        return null;
    }
}
