package mypackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mypackage.employeeservice.EmployeeService;
import mypackage.model.Employee;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT},allowedHeaders = "*")
public class EmployeeApiController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("api/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.GetAllEmployee();
    }

    @PostMapping("api/employee")
    public Employee addEmployee(@RequestBody Employee emp) {
        return employeeService.AddEmployee(emp);
    }

    @PutMapping("api/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee emp) {
        emp.setEmployeeid(id); 
        return employeeService.UpdataEmployee(emp);
    }

    @GetMapping("api/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.GetEmployeeById(id);
    }

    @DeleteMapping("api/employee/{id}")
    public Employee deleteEmployee(@PathVariable("id") int id) {
        return employeeService.DeleteEmployee(id);
    }
}
