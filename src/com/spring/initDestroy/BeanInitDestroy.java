package com.spring.initDestroy;

public class BeanInitDestroy {
	private String message;

	public void getMessage() {
		System.out.println("Your message:"+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Initiated Bean");
	}
	
	public void destroy(){
		System.out.println("Destroyed Bean");
	}
}
