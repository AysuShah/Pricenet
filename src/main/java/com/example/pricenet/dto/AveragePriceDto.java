package com.example.pricenet.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AveragePriceDto {

 private Integer minprice;

 private Integer maxprice;
}
