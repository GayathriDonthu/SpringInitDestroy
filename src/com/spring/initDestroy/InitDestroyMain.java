package com.spring.initDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		SampleBean sb = (SampleBean) context.getBean("sampleBean");
		sb.getName();
		BeanInitDestroy beanObj = (BeanInitDestroy) context.getBean("beanInitDestroy");
		beanObj.getMessage();
		
		context.registerShutdownHook();
	}
}
