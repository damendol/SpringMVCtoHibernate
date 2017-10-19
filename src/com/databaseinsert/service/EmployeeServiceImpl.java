package com.databaseinsert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.databaseinsert.dao.EmployeeDao;
import com.databaseinsert.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	public EmployeeDao employeeDao;
	
	@Override
    @Transactional
	public void register(Employee employee) {
		employeeDao.register(employee);
	}
}
