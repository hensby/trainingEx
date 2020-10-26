package net.antra.springdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository // default name = demoDAOImpl2
//@Primary //覆盖 or @Qualifier("ImplName")
public class DemoDAOImpl2 implements DemoDAO {

	@Autowired(required = false)
	private String message = "DemoDAOImpl2";
	
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

	public void test1234() {
		System.out.println("Inside testmethod");
		throw new RuntimeException();
	}
}
