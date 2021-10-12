package cn.gov.frame.beans.factory;

/**
 * @Description:
 * @Author: hujinsheng
 * @CreateDate: 2021/10/12 4:33 下午
 * @Email: hujinsheng005@cic.cn
 */

public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
