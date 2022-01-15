package nvc.it.ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.ex1.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    
}
