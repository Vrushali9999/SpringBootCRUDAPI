package net.xvru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.xvru.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
