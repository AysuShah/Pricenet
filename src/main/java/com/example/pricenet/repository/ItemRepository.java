package com.example.pricenet.repository;

import com.example.pricenet.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class ItemRepository {


   @Repository
    public  interface ItemRepositery extends JpaRepository<ItemEntity , Long>{

   }
    }

