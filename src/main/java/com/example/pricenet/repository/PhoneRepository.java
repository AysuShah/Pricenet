package com.example.pricenet.repository;

import com.example.pricenet.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
    public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {
    ArrayList<PhoneEntity> findAllByModel(String model);

    PhoneEntity findByAnnouncementId(int id);

    ArrayList<PhoneEntity> findAllByPriceBetween(Long firstPrice, Long lastPrice);

    ArrayList<PhoneEntity> findAllByDateBetween(Date firstDate, Date lastDate);

    ArrayList<PhoneEntity> findAllByAreaBetween(Integer minArea, Integer maxArea);

    ArrayList<PhoneEntity>
    findAllByLocationAndRoomsAndExtractAndRepairAndPriceBetweenAndAreaBetween(String location,String rooms,String extract,String repair,
                                                                              Long minPrice, Long maxPrice,Integer minArea, Integer maxArea);

    }


