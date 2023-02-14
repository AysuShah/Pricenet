package com.example.pricenet.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {

    private int id;

    private Integer price;

    private String model;

    private String specifications;


}
