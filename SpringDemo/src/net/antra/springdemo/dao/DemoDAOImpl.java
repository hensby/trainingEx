package net.antra.springdemo.dao;

import net.antra.springdemo.aop.Antra;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository // default name = demoDAOImpl 
public class DemoDAOImpl implements DemoDAO {
	
	private String message = "DemoDAOImpl";
	
	public void doSomething(){
		System.out.println(message);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void saveDemo(String a, String b) {
		System.out.println("In save DEMO " + a + " " + b + " " + message);
	}

	@Antra
	public void test1234(String str) {
		System.out.println("Inside test method");
//		throw new RuntimeException();
	}
}
