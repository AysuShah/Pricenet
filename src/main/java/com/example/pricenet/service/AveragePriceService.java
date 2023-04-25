package com.example.pricenet.service;

import com.example.pricenet.dto.AveragePriceDto;
import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AveragePriceService {

    private final PhoneRepository repository;

    Long averagePrice = 0L;

    public Long getAveragePrice(AveragePriceDto dto) {

        List<PhoneEntity> all = repository.findAll();
        for (PhoneEntity a : all) {
           averagePrice =0L;
            String s= a.getPrice().replaceAll("\\.", "");
                long l = Long.parseLong(s);
                averagePrice+=l;

            }

            try {
                averagePrice = averagePrice/all.size();

            }catch (ArithmeticException e){
                return 0L;
            }

            return averagePrice;

        }
}