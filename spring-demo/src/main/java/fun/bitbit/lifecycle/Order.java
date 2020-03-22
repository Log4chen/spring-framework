package fun.bitbit.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Order implements BeanPostProcessor,BeanFactoryPostProcessor,InitializingBean {

    static {
        System.out.println("order--static{}");
    }

    {
        System.out.println("order--{}");
    }

    public Order() {
        System.out.println("order--A()");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("order--PostConstruct");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println("order--preDestory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("order--afterPropertiesSet");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("order--postProcessBeanFactory");
    }

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("textEditor"))
        System.out.println("order--postProcessBeforeInitialization");
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("textEditor"))
        System.out.println("order--postProcessAfterInitialization");
        return bean;
    }
}
