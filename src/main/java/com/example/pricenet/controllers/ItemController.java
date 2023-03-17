package com.example.pricenet.controllers;


import com.example.pricenet.dto.ItemDto;
import com.example.pricenet.entity.ItemEntity;
import com.example.pricenet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/pricenetdata")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;


    @PostMapping("/addnewdata")
    public ItemEntity addNewData(ItemDto itemDto) throws IOException {
       return itemService.saveItemJsoupData();

    }
}

