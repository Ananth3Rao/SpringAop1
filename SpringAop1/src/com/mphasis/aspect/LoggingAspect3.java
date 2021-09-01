package com.mphasis.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect3 {

//	@AfterThrowing("args(name)")
//	public void exceptionAdvise(String name) {
//		System.out.println("An exception has been thrown " + name);
//	}
	
	
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exceptionAdvise(String name, RuntimeException ex) {
		System.out.println("An exception has been thrown " + name + ", exception " + ex);
	}
	
	
}
