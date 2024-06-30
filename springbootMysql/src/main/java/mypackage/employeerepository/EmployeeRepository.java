package mypackage.employeerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
