package com.example.pricenet.controllers;


import com.example.pricenet.Jsoup.JsoupItemPhonePriceService;
import com.example.pricenet.dto.PhoneDto;
import com.example.pricenet.entity.PhoneEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/phone")
@RequiredArgsConstructor
public class PhoneController {

    private final JsoupItemPhonePriceService service;


    @PostMapping("/save")
    public void addNewData() throws IOException {
        service.fixedRateSch();
    }

//    @RequestMapping(value = "getById", method = RequestMethod.GET)
//    public PhoneDto getUsersDataById(@RequestBody PhoneDto phoneDto) {
//
//
//        return phoneDto;
//    }

    @RequestMapping(value = "getAllPhones", method = RequestMethod.GET)
    public  List<PhoneEntity> getAllPhones() throws IOException {
        List<PhoneEntity> phoneEntities= service.retrieveAllPhones();
        return phoneEntities;
    }
}



