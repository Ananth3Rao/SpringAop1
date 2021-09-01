package com.mphasis.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect2 {

//	@AfterReturning(pointcut = "args(..)", returning = "returnString")
//	public void stringArgumentMethods(String returnString) {
//		System.out.println("A method that returns" + returnString);
//	}
//	
//	
//	@Pointcut("execution(public String get*(..))")
//	public void args() {
//		
//	}
	
	@Pointcut("within(com.mphasis.model.*)")
	public void allEmployeeMethods() {
		
	}
	
	@Before("allEmployeeMethods()")
	public void loggingAdvice(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());
		System.out.println(joinpoint.getTarget());
	}
 }
