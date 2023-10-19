package com.clincapi.api.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorReposity extends JpaRepository<Doctor, Long> {
}
