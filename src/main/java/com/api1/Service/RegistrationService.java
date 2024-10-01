package com.api1.Service;

import com.api1.Entity.Registration1;
import com.api1.Repository.RegistrationRepository;
import jakarta.servlet.Registration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class RegistrationService {


    private RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }
    public List<Registration1> getRegistrations(){
        List<Registration1> registration1s = registrationRepository.findAll();
        return registration1s;


    }

    public Registration1 createRegistration1(Registration1 registration1) {
        Registration1 savedEntity = registrationRepository.save(registration1);
        return savedEntity;
    }

    public void deleteRegistration1(long id) {
        registrationRepository.deleteById(id);
    }

    public Registration1 updateRegistration1(long id, Registration1 registration1) {
         Registration1 r1=registrationRepository.findById(id).get();
         
         r1.setName(registration1.getName());
         r1.setEmail(registration1.getEmail());
         r1.setMobile(registration1.getMobile());
         Registration1 savedEntity=registrationRepository.save(r1);
         return savedEntity;
    }
}
