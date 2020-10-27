package net.antra.deptemp.service;

import net.antra.deptemp.dao.EmployeeDAO;
import net.antra.deptemp.entity.Employee;
import net.antra.deptemp.pojo.EmployeeVO;
import net.antra.deptemp.utility.DomainVOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDAO;

	@Override
	public List<Employee> loadEmpBasicInfo() {
		return empDAO.getEmployeeList();
	}

	@Override
	public Employee getEmpById(int id) {
		return empDAO.findById(id).get();
	}

	@Override
	public void saveEmployee(EmployeeVO empVO) {
		Employee emp = DomainVOConverter.convertEmpVOtoEmp(empVO);
		empDAO.save(emp);
	}

}
