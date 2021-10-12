package cn.gov.frame.beans.factory.support;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:39 下午
 * @Email: hujinsheng005@cic.cn
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
