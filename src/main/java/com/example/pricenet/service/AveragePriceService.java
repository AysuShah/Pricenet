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
            Long averagePrice =0L;

                long l = Long.parseLong(a.getPrice());
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