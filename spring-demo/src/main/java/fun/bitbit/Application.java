package fun.bitbit;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("fun.bitbit")
//@ImportResource("classpath:application.xml")
public class Application {
	public static void main(String[] args) {
		System.out.println("hh");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		TextEditor editor = context.getBean(TextEditor.class);
		editor.inputText("hello");
		context.close();
	}
}
