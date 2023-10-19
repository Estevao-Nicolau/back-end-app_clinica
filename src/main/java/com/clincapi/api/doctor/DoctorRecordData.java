package com.clincapi.api.doctor;

import com.clincapi.api.address.Address;

public record DoctorRecordData(String name, String email, String crm, Special special, Address address) {
}
