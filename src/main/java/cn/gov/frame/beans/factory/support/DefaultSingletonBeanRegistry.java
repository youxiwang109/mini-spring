package cn.gov.frame.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:41 下午
 * @Email: hujinsheng005@cic.cn
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<String, Object>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.putIfAbsent(beanName,singletonObject);
    }
}
