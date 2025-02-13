package mypackage.employeeservice;

import mypackage.model.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.employeerepository.*;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	
	
	public Employee AddEmployee(Employee e)
	{
		Employee emp=emprepo.save(e);
		return emp;
	}
	
	public Employee UpdataEmployee(Employee e) {
	    if (emprepo.existsById(e.getEmployeeid())) { 
	        return emprepo.save(e);
	    }
	    throw new RuntimeException("Employee not found with ID: " + e.getEmployeeid());
	}

	
	public Employee GetEmployeeById(int id)
	{
		Employee e= emprepo.findById(id).get();
		return e;
	}
	public Employee DeleteEmployee(int id) {
	    if (!emprepo.existsById(id)) {
	        throw new RuntimeException("Employee not found with ID: " + id);
	    }
	    Employee e = GetEmployeeById(id);
	    emprepo.delete(e);
	    return e;
	}

	
	public List<Employee> GetAllEmployee(){
		
		return emprepo.findAll();
	}
	
}
