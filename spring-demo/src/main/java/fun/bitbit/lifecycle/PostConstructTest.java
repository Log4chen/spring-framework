package fun.bitbit.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostConstructTest implements BeanFactoryPostProcessor {


	@PostConstruct
	public void postConstruct(){
		System.out.println("PostConstructTest PostConstruct");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("PostConstructTest postProcessBeanFactory");
	}
}
