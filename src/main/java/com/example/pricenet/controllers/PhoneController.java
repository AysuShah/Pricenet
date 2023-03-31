package com.example.pricenet.controllers;


import com.example.pricenet.Jsoup.JsoupItemPhonePriceService;
import com.example.pricenet.dto.ItemDto;
import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

