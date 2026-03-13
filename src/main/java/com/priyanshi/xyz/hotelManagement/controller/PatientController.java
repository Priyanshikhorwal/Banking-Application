package com.priyanshi.xyz.hotelManagement.controller;

import com.priyanshi.xyz.hotelManagement.entity.Patient;
import com.priyanshi.xyz.hotelManagement.repository.PatientRepository;
import com.priyanshi.xyz.hotelManagement.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/patient")
public class PatientController {

    private final PatientService patientService;
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patients){
        Patient patient=patientService.addPatient(patients);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }
}
