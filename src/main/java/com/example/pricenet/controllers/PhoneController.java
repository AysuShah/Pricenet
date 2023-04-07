package com.example.pricenet.controllers;


import com.example.pricenet.Jsoup.JsoupItemPhonePriceService;
import com.example.pricenet.dto.PhoneDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/phone")
@RequiredArgsConstructor
public class PhoneController {

    private final JsoupItemPhonePriceService service;


    @PostMapping("/save")
    public void addNewData() throws IOException {
     service.savePhoneToOb();
    }

    @RequestMapping(value = "https://qiymeti.net/telefon/", method = RequestMethod.GET)
    public PhoneDto getUsersDataById(@RequestBody PhoneDto phoneDto) {


        return phoneDto;
    }
}

