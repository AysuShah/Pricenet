package com.example.pricenet.service;

import com.example.pricenet.dto.PhoneDto;
import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.repository.PhoneRepository;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final PhoneRepository phoneRepository;


    public ItemService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public PhoneEntity addNewItemData(PhoneDto phoneDto) {
        PhoneEntity itemEntity = PhoneEntity.builder()
                .id(phoneDto.getId())
                .price(phoneDto.getPrice())
                .model(phoneDto.getModel())
                .specifications(phoneDto.getSpecifications())
                .build();

        return phoneRepository.save(itemEntity);
    }


    public PhoneEntity saveItemJsoupData() {

        return null  ;
    }
}



