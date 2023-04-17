package com.example.pricenet.controllers;

import com.example.pricenet.Jsoup.JsoupItemPhonePriceService;
import com.example.pricenet.dto.AveragePriceDto;
import com.example.pricenet.service.AveragePriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phone")
@RequiredArgsConstructor
public class PriceAverageController {

    private final JsoupItemPhonePriceService service;

    private final AveragePriceService averagePrice;

    @GetMapping
    public Long getPrice(@RequestParam String maxprice, @RequestParam String minprice) {

        AveragePriceDto dto = new AveragePriceDto();
        dto.setMinprice(minprice);
        dto.setMaxprice(maxprice);
        return averagePrice.getAveragePrice(dto);
    }
}
