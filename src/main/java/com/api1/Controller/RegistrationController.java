package com.api1.Controller;


import com.api1.Entity.Registration1;
import com.api1.Service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration1")

public class RegistrationController {


    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public ResponseEntity<List<Registration1>> getAllRegistrations() {
        List<Registration1> registration1s = registrationService.getRegistrations();
        return new ResponseEntity<>(registration1s, HttpStatus.OK);
    }

@PostMapping
    public ResponseEntity<Registration1> createRegistration1(
            @RequestBody Registration1 registration1
    ) {

        Registration1 reg1 = registrationService.createRegistration1(registration1);
        return new ResponseEntity<>(reg1, HttpStatus.CREATED);

    }
    @DeleteMapping
     public ResponseEntity<String>deleteRegistration1(
           @RequestParam  long id
     ){
      registrationService.deleteRegistration1(id);
      return new ResponseEntity<>("Delete",HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Registration1>updateRegistration1(
         @PathVariable   long id,
         @RequestBody Registration1 registration1
    ){
        Registration1 updateReg=registrationService.updateRegistration1(id,registration1);
        return new ResponseEntity<>(updateReg,HttpStatus.OK);
    }

}







