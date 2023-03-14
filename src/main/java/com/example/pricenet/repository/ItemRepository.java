package com.example.pricenet.repository;

import com.example.pricenet.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

    }


