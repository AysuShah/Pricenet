package com.example.pricenet.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AveragePriceDto {

 String minprice;

 String maxprice;
}
