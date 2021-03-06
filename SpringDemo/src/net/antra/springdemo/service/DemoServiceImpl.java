package net.antra.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.antra.springdemo.dao.DemoDAO;

@Service("aService")
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	@Qualifier("demoDAOImpl2")
	DemoDAO aDAO2;   // use interface here
	
	@Autowired
	@Qualifier("demoDAOImpl")
	DemoDAO aDAO;
	
	@Override
	public void doSomeThing() {
		aDAO.doSomething();
		aDAO.test1234("in DAO Impl");
	}
//	@Autowired
//	public DemoServiceImpl(DemoDAO d){
//		aDAO = d;
//	}
	public DemoDAO getaDAO() {
		return aDAO;
	}
}
