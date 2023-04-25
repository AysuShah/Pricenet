package com.example.pricenet.telegram.telegramService;

import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.repository.PhoneRepository;
import com.example.pricenet.telegram.dto.send.SendMessageResponseDTO;
import com.example.pricenet.telegram.dto.send.text.SendMessageDTO;
import com.example.pricenet.telegram.entity.TelegramEntity;
import com.example.pricenet.telegram.enums.TelegramEnum;
import com.example.pricenet.telegram.repository.TelegramRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BotSchedulerBetArea {
//    @Value("${telegram.api.base-url}")
//    String api;
//
//    @Value("${telegram.api.token}")
//    String token;
//
//    private   Long offset = null;
//
//    private final TelegramRepository telegramRepository;
//    private final PhoneRepository phoneRepository;
//
//
//    public void getUpdatesByArea(String text, Long id, TelegramEntity byChatId) throws IOException {
//
//                if (text.equals("/betweenarea")){
//                   sendMessage("Müəyyən kvadrat aralıqda evlərin tapılması xidməti",id);
//                   sendMessage("Zəhmət olmasa minimum m2 daxil edin:",id);
//
//                   byChatId.setChatStage(TelegramEnum.MIN_AREA.name());
//                   telegramRepository.save(byChatId);
//
//               } else if (byChatId.getChatStage().equals(TelegramEnum.MIN_AREA.name())) {
//                   byChatId.setMinArea(text);
//                   telegramRepository.save(byChatId);
//
//                   byChatId.setChatStage(TelegramEnum.MAX_AREA.name());
//                   telegramRepository.save(byChatId);
//                   sendMessage("Zəhmət olmasa maximum m2 daxil edin:",id);
//               } else if (byChatId.getChatStage().equals(TelegramEnum.MAX_AREA.name())) {
//                   byChatId.setMaxArea(text);
//                   telegramRepository.save(byChatId);
//
//                   Integer minArea = Integer.valueOf(byChatId.getMinArea());
//                   Integer maxArea = Integer.valueOf(byChatId.getMaxArea());
//
//                   ArrayList<PhoneEntity> allByAreaBetween =
//                           phoneRepository.findAllByAreaBetween(minArea, maxArea);
//
//
//                   if (allByAreaBetween.size()>0) {
//                       for (PhoneEntity item : allByAreaBetween) {
//                           sendMessage("https://bina.az/items/" + item.getAnnouncementId(), id);
//                       }
//                   }
//
//                 else if (allByAreaBetween.size()==0 || allByAreaBetween==null){
//                       sendMessage("O aralıqda evlər tapilmadı",id);
//                   }
//
//
//               }
//
//            }
//
//
//
//
//
//    public void sendMessage(String text, Long id) throws IOException {
//        String url1 = api + "/bot" + token + "/sendMessage";
//
//
//        SendMessageDTO dto = SendMessageDTO.builder()
//                .chatId(id)
//                .text(text)
//                .build();
//
//
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.postForObject(url1, dto, SendMessageResponseDTO.class);
//
//    }
//
//
}
