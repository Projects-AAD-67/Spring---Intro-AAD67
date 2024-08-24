package lk.ijse.gdse.aad67.obj;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class LifeCycle implements BeanNameAware,BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is :" +name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
         System.out.println("BeanFactory is :" +beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
       System.out.println("Initializing Bean with after PropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context is : " +applicationContext);
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Man yanawooooooo bye.......");
    }
    @PreDestroy
    public void getLost(){
        System.out.println("Lost the bean");
    }
}
