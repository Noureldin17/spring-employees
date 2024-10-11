package com.example.restapidemo.dao;

import com.example.restapidemo.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    void testEmail(){
        String email = "nour@email.com";
        Employee employee = new Employee("Noureldin", "Mohamed", email);
        employeeRepository.save(employee);
        String expected = employeeRepository.findByEmail(email).get().getEmail();
        assertSame(expected ,email);
    }
}