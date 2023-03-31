package com.example.pricenet.service;

import com.example.pricenet.dto.ItemDto;
import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.repository.PhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final PhoneRepository phoneRepository;


    public ItemService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public PhoneEntity addNewItemData(ItemDto itemDto) {
        PhoneEntity itemEntity = PhoneEntity.builder()
                .id(itemDto.getId())
                .price(itemDto.getPrice())
                .model(itemDto.getModel())
                .specifications(itemDto.getSpecifications())
                .build();

        return phoneRepository.save(itemEntity);
    }


    public PhoneEntity saveItemJsoupData() {

        return null  ;
    }
}



