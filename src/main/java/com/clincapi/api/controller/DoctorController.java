package com.clincapi.api.controller;

import com.clincapi.api.doctor.MedicalRegistrationData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @PostMapping
    public void registration(@RequestBody MedicalRegistrationData datas){
        System.out.println(datas);
    }
}
