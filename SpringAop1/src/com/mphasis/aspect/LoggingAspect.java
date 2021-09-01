package com.mphasis.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	// @Before("execution(public String get*(..))") // '*' - requires a minimum of
	// one parameter, '..' - allows 0 or more parameters
	@Before("allEmployeeMethods()")
	public void loggingAdvice() {
		System.out.println("This is logging before advice");
	}

	// @After("execution(public String getName())")
	@After("allEmployeeMethods()")
	public void loggingAdviceAfter() {
		System.out.println("This is logging After advice");
	}

	@Before("addMethod()")
	public void loggingAddAdvice() {
		System.out.println("add method logging advice");
	}
	
	@After("addMethod()")
	public void validationAdvice() {
		System.out.println("After validation advice for add method after return");
	}

//	@Pointcut("execution(public * com.mphasis.model..*(..))")
//	public void getAll() {
//
//	}

//	@Before("allEmployeeMethods()")
//	public void validationAdvices() {
//		System.out.println("Before validation advice for all method after retursssn");
//	}
	
	@Pointcut("execution(public * add(..))")
	public void addMethod() {

	}

	@Pointcut("within(com.mphasis.model.*)")
	public void allEmployeeMethods() {

	}
}
