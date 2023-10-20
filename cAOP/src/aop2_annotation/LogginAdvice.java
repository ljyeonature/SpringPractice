package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAdvice {
	
	
//	@Around("execution(public * aop2_annotation.*.*Hello(..))")
//	public Object around(ProceedingJoinPoint point) throws Throwable {
//		String methodName = point.getSignature().getName();
//		System.out.println("[********** 사전작업] : " + methodName);
//		Object obj = point.proceed();
//		System.out.println("[********** 후반작업] : " + methodName);
//		return obj;
//	}
	
	@Before("execution(public * aop2_annotation.*.*Hello(..))")
	public void before(JoinPoint point) throws Throwable {
		
		
		String methodName = point.getSignature().getName();
		System.out.println("[********** 사전작업] : " + methodName);
	}
	
	@After("execution(public * aop2_annotation.*.*Hello(..))")
	public void after(JoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		System.out.println("[********** 후속작업] : " + methodName);
	}

}
