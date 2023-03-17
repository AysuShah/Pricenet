package com.example.pricenet.service;

import com.example.pricenet.dto.ItemDto;
import com.example.pricenet.entity.ItemEntity;
import com.example.pricenet.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;


    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemEntity addNewItemData(ItemDto itemDto) {
        ItemEntity itemEntity = ItemEntity.builder()
                .id(itemDto.getId())
                .price(itemDto.getPrice())
                .model(itemDto.getModel())
                .specifications(itemDto.getSpecifications())
                .build();

        return itemRepository.save(itemEntity);
    }


    public ItemEntity saveItemJsoupData() {

        return null  ;
    }
}



