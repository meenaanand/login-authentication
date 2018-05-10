package com.kgisl.register.register.repository;

import com.kgisl.register.register.model.Register;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, String> {
    
    }