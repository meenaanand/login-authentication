package com.kgisl.register.register.service;

import java.util.List;

import com.kgisl.register.register.model.Register;
import com.kgisl.register.register.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImp implements RegisterService{

    @Autowired 
    private RegisterRepository registerrepository;

    @Override
    public List<Register> findAll(){
        return registerrepository.findAll();
    }

    @Override
    public void saveRegister(Register register){

        registerrepository.save(register);
    }
    
    @Override
    public void updateRegister(Register register ,String email){
        register.setEmail(email);
        registerrepository.saveAndFlush(register);
        
    }

    // @Override
    // public Register findOne(String email){
    //     return registerrepository.findOne(email);
    // }

	// @Override
	// public void delete(String email) {
    //     registerrepository.delete(email);
        
	// }

}