package service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import model.Employee;


@Service //@Component 
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public EmployeeDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getListEmployees() {
		return (List<Employee>)sessionFactory.getCurrentSession().createQuery("FROM Employee").list();
	}

	@Override
	public void addOrEditNewEmployee(Employee emp) {
		sessionFactory.getCurrentSession().saveOrUpdate(emp);
	}

	@Override
	public void delectEmployee(Employee emp) {
		sessionFactory.getCurrentSession().delete(emp);
	}

	@Override
	public Employee getEmployeeByNumber(String num) {
		return (Employee) sessionFactory.getCurrentSession().createQuery("FROM Employee where employeeNumber = "+num).uniqueResult();
	}
	
	

}
