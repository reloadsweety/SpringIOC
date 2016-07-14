package service;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {

	public List<Employee> getListEmployees();
	public void addOrEditNewEmployee(Employee emp);
	public void delectEmployee(Employee emp);
	public Employee getEmployeeByNumber(String num);
}
