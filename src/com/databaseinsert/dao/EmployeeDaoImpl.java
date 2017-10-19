package com.databaseinsert.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.databaseinsert.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void register(Employee employee) {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		session.save(employee);
		tr.commit();
		System.out.println("Successfully inserted");
		sessionFactory.close();
	}
	
	class EmployeeMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			Employee employee = new Employee();
		    employee.setId(rs.getInt("id"));
		    employee.setAge(rs.getInt("age"));
		    employee.setFirst(rs.getString("first"));
		    employee.setLast(rs.getString("last"));
		    return employee;
		}
	}
}
