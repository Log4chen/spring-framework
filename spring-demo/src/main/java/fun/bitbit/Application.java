package fun.bitbit;

import fun.bitbit.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("fun.bitbit")
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		HelloService helloService = context.getBean(HelloService.class);
		helloService.hello();
		context.close();
	}
}
