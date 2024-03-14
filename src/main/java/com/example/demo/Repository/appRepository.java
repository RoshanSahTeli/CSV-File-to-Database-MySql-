package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.employee;

public interface appRepository extends JpaRepository<employee, String> {

}
