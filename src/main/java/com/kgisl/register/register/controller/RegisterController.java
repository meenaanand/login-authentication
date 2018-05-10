package com.kgisl.register.register.controller;

import java.util.List;

import com.kgisl.register.register.model.Register;
import com.kgisl.register.register.service.RegisterService;

// import com.kg.demoflight.model.Flightt;
// import com.kg.demoflight.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

@RequestMapping("/register")
public class RegisterController {

    @Autowired 
    public RegisterService registerService;
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> saveRegister(@RequestBody Register register){
        registerService.saveRegister(register);
        return new ResponseEntity<Register>(register,HttpStatus.OK);
    }

    // @RequestMapping(value="/{email}", method =RequestMethod.DELETE)
    // public void deleteRegister(@PathVariable String email ){
    //     registerService.delete(email);
    // }

    @RequestMapping(method = RequestMethod.GET)
    public List<Register> getregister() {
        return registerService.findAll();
    }

    // @RequestMapping(value = "/{email}", method = RequestMethod.GET)
    // public Register getRegister(@PathVariable String email) {
    //     return registerService.findOne(email);
    // }

    @RequestMapping(value = "/{email}", method = RequestMethod.PUT)

    public ResponseEntity<?> updateRegister(@RequestBody Register  register, @PathVariable("email") String email) {
        Register f1 =  register;
        registerService.updateRegister(f1, email);
        return new ResponseEntity<Register>(HttpStatus.OK);

    }
}