package com.clincapi.api.doctor;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String logradouro;
    private String bairro;
    private String cep;
    private String city;
    private String uf;
    private String number;
    private String complement;

    public Address(com.clincapi.api.address.Address datas) {
        this.logradouro = datas.logradouro();
        this.bairro = datas.bairro();
        this.uf = datas.uf();
        this.city = datas.city();
        this.number = datas.number();
        this.complement = datas.complement();
        this.cep = datas.cep();
    }
}