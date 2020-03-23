package fun.bitbit.lifecycle;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Order implements InitializingBean, BeanNameAware{

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
	public void postConstruct() {
		System.out.println("order--PostConstruct");
	}

	@PreDestroy
	public void preDestory() {
		System.out.println("order--preDestory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("order--afterPropertiesSet");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("order--setBeanName:" + name);
	}
}
