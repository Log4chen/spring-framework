package fun.bitbit.postProcessor;

import fun.bitbit.service.impl.EnglishSpellChecker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassName: MyBeanPostProcessor <br/>
 *
 * @Author: chenyuesheng  <br/>
 * Date: 2020/3/23 12:08 <br/>
 * Version: 1.0 <br/>
 * Description:  <br/>
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	static {
		System.out.println("MyBeanPostProcessor--static{}");
	}

	{
		System.out.println("MyBeanPostProcessor--{}");
	}

	@Autowired
	public void setXXX(EnglishSpellChecker checker) {
		System.out.println("setter方法注入checker:" + checker);

	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("MyBeanPostProcessor--PostConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("MyBeanPostProcessor--preDestory");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("order"))
			System.out.println("MyBeanPostProcessor--postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("order"))
			System.out.println("MyBeanPostProcessor--postProcessAfterInitialization");
		return bean;
	}
}
