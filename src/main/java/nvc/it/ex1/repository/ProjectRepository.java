package nvc.it.ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.ex1.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    
}
