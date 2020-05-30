package org.zensar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.zensar.entity.Employee;

@Repository
public class EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void saveEmployee(Employee employee) {

		entityManager.persist(employee);
	}

	public void updateEmployee(Integer eno, Employee emp) {
		
		Employee employee = entityManager.find(Employee.class, eno);

		if (employee != null) {
			entityManager.persist(emp);
		}
	}
	
	public Employee findEmployee(Integer eno) {
		
		Employee employee = entityManager.find(Employee.class, eno);
		
		return employee;
	}
	
	public List<Employee> findAllEmployees() {
		
		String query = "select e from Employee e";
		
		TypedQuery<Employee> typedQuery = entityManager.createNamedQuery(query, Employee.class);
		
		List<Employee> resultList = typedQuery.getResultList();
		
		return resultList;
	}
	
	public void deleteEmployee(Integer eno) {
		
		Employee employee = entityManager.find(Employee.class, eno);
		
		if (employee != null) {
			
			entityManager.remove(employee);
		}
	}
}
