package com.mphasis.main;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.model.Customer;
import com.mphasis.service.PeopleService;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		PeopleService service = (PeopleService) ctx.getBean("service");
		service.getEmployee().setName("Ananth from main emp");	
		
		service.getCustomer().setName("Ananth from main cust");	
		System.out.println(service.getEmployee().getName());
		
		System.out.println(service.getCustomer().getName());
//		
//		System.out.println(service.getCustomer().getXXX());
//		System.out.println(service.getCustomer().getXXX(123));
//		
//		Customer cust = service.getCustomer();
//		
//		System.out.println(cust.add(4, 123));
//		System.out.println(cust.add(4.13, 123.12));
		//Testing a push
	}

}
