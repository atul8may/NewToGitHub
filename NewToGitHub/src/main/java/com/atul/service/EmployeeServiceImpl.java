package com.atul.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atul.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEmployeeBySsn(String ssn) {
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
	@Override
	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
