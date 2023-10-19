package com.clincapi.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Special special;

    @Embedded
    private Address address;

    public Doctor(DoctorRecordData datas) {
        this.name = datas.name();
        this.email = datas.email();
        this.crm = datas.crm();
        this.special = datas.special();
        this.address = new Address(datas.address());
    }
}
