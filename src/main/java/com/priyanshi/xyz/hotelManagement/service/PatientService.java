package com.priyanshi.xyz.hotelManagement.service;

import com.priyanshi.xyz.hotelManagement.entity.Patient;
import com.priyanshi.xyz.hotelManagement.repository.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
