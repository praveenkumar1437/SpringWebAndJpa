package org.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zensar.dao.EmployeeDao;
import org.zensar.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public void saveEmp(Employee employee) {
		
		employeeDao.saveEmployee(employee);
	}
	
	@Transactional
	public void updateEmp(Integer eno,Employee employee) {
		
		employeeDao.updateEmployee(eno,employee);
	}
	
	@Transactional
	public Employee findEmp(Integer eno) {
		
		return employeeDao.findEmployee(eno);
	}
	
	public List<Employee> findAllEmp() {
		
		return employeeDao.findAllEmployees();
	}
	
	@Transactional
	public void deleteEmp(Integer eno) {
		
		employeeDao.deleteEmployee(eno);
	}
}
