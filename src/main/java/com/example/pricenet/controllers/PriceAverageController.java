package com.example.pricenet.controllers;

import com.example.pricenet.Jsoup.JsoupItemPhonePriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/phone")
@RequiredArgsConstructor
public class PriceAverageController {

    private final JsoupItemPhonePriceService service;

    PhoneController getAverage(
            @PathVariable @Min(1000) @Max(3000) String price )

}
