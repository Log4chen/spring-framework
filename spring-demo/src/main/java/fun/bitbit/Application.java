package fun.bitbit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("fun.bitbit")
//@ImportResource("classpath:application.xml")
@EnableAspectJAutoProxy // 开启aop,会添加一个BeanPostProcessor-AnnotationAwareAspectJAutoProxyCreator创建代理
public class Application {
	public static void main(String[] args) {
		// 该构造方法，相当先后于执行了
		// 1、无参构造方法
		// 2、register(Class<?>... annotatedClasses)
		// 3、refresh
//		AnnotationConfigApplicationContext context0 = new AnnotationConfigApplicationContext(Application.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Application.class);
//		context.addBeanFactoryPostProcessor(beanFactory -> System.out.println("手动add的BeanFactoryPostProcessor"));
		context.refresh();

//		TextEditor editor = context.getBean(TextEditor.class);
//		editor.inputText("hello");
//		context.close();
	}
}
