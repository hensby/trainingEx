package net.antra.springdemo.config;

import net.antra.springdemo.dao.DemoDAO;
import net.antra.springdemo.dao.DemoDAOImpl;
import net.antra.springdemo.dao.DemoDAOImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "net.antra.springdemo" })
@EnableAspectJAutoProxy
public class MyConfig {

	@Bean(name="myString")
	public String getAString(){
		return "hello";
	}

	@Bean(name="DAOImpl")
	public DemoDAO getNewDAO() {
		return new DemoDAOImpl();
	}

	@Bean(name="DAOImpl2")
	public DemoDAO getNewDAO2() {
		return new DemoDAOImpl2();
	}
}
