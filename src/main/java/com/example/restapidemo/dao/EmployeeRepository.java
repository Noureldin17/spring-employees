package com.example.restapidemo.dao;

import com.example.restapidemo.entity.Employee;
import com.example.restapidemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    Optional<Employee> findByEmail(String email);
}
