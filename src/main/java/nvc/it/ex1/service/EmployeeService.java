package nvc.it.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.ex1.model.Employee;
import nvc.it.ex1.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public List<Employee> findByName(String name){
        return employeeRepository.findByNameContaining(name);
    }

    public List<Employee> findBySalary(int salary){
        return employeeRepository.findBySalaryLessThanEqual(salary);
    }
}
