package com.example.pricenet.controllers;

import com.example.pricenet.Jsoup.JsoupItemPhonePriceService;
import com.example.pricenet.dto.AveragePriceDto;
import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.service.AvaragePrice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/phone")
@RequiredArgsConstructor
public class PriceAverageController {

    private final JsoupItemPhonePriceService service;

    private final AvaragePrice averagePrice;

//    @GetMapping
//    public List<PhoneEntity> getPrice(@RequestParam String maxprice, @RequestParam String minprice) {
////
////        AveragePriceDto dto = new AveragePriceDto();
////        dto.setMinprice(minprice);
////        dto.setMaxprice(maxprice);
////        return averagePrice.getClass(dto);
//    }
}
