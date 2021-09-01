package com.mphasis.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect4 {

	@Pointcut("execution(* getName())")
	public void getAll() {
		
	}
	
	@Around("getAll()")
	public Object myAroundAdvice(ProceedingJoinPoint proceeding) {
		Object ret = null;
		try {
			System.out.println("Before Advice");
			ret = proceeding.proceed();
			System.out.println("After Advice");
			
		} catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After finally ... ");
		return ret;
	}
	
}
