package com.clincapi.api.controller;

import com.clincapi.api.doctor.Doctor;
import com.clincapi.api.doctor.DoctorReposity;
import com.clincapi.api.doctor.DoctorRecordData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorReposity repository;
    @PostMapping
    @Transactional
    public void registration(@RequestBody DoctorRecordData datas){
        repository.save(new Doctor(datas));
    }
}
