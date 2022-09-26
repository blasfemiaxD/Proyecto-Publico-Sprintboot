package cl.crud.user.crudUser.controllers;

import cl.crud.user.crudUser.models.PatientModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/v1/patient", consumes="application/json")
//@RequestMapping("/v1/patient")
public class PatientController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello Patient Rest Service";
    }

    @PostMapping()
    public PatientModel savePatient(@RequestBody PatientModel patient){
        return patient;
    }

}
