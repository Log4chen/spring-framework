package fun.bitbit.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class ServiceAspect {
	@Pointcut("execution(public String fun.bitbit.service.order.*.*(java.lang.Integer...))")
	public void pointAboutOrder() {
	}

	@Pointcut("execution(* fun.bitbit.service.*.*(..))")
	public void pointGet() {
	}

	@Before("pointGet()")
	public void test(){
		System.out.println("before");
	}
}
