package com.example.pricenet.telegram.repository;


import com.example.pricenet.telegram.entity.TelegramEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelegramRepository extends JpaRepository<TelegramEntity,Long> {
   TelegramEntity findByChatId(Long chatId);
}
