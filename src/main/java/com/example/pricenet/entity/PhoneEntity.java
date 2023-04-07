package com.example.pricenet.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private String price;

    @Column(name = "minprice")
    private int minprice;

    @Column(name = "model")
    private String model;

    @Column(name = "specifications")
    private String specifications;
}



