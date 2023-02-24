package com.example.pricenet.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {

    private int id;

    private int price;

    private int minprice;

    private String model;

    private String specifications;


}
