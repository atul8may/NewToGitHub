package com.atul.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.atul.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Employee findEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

}
