package com.kgisl.register.register.service;

import java.util.List;

import com.kgisl.register.register.model.Register;


public interface RegisterService {
    public List<Register> findAll();
    public void saveRegister (Register register);
   public void updateRegister  (Register register , String email);
//    public Register findOne(String email);
//    public void delete (String email);
}