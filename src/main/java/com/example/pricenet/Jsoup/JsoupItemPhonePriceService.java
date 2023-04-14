package com.example.pricenet.Jsoup;

import com.example.pricenet.controllers.PhoneController;
import com.example.pricenet.entity.PhoneEntity;
import com.example.pricenet.repository.PhoneRepository;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Properties;


@Component
@AllArgsConstructor
public class JsoupItemPhonePriceService {

    private final PhoneRepository phoneRepository;

    @Scheduled(fixedRate = 1000)
    public void fixedRateSch() throws IOException {

        Document pageCount = Jsoup.connect("https://qiymeti.net/qiymetleri/telefon/").get();

        Elements page = pageCount.getElementsByClass("page-numbers");

        int size = page.size();

        Element element = page.get(size - 1);

        String pageNumber = "1";

        for (int i = 1; i <= Integer.parseInt(pageNumber); i++) {

            Document document = Jsoup.connect("https://qiymeti.net/qiymetleri/telefon/page/" + i).get();

            Elements products = document.getElementsByClass("product");


            for (Element product : products) {


                Elements minprice = product.getElementsByClass("min-price");
                Elements model = product.getElementsByClass("name");
//                Elements specifications = product.getElementsByClass("specifications");


                Elements href = product.getElementsByClass("thumbnail");
                href = href.get(0).getElementsByTag("a");
                String attr = href.attr("href");


                Document document2 = Jsoup.connect("https://qiymeti.net/telefon/" + attr).get();
                Elements value = document2.getElementsByAttributeValue("target", "_blank");
                value = value.not(".sub-price-row");
//                System.out.println(elements.get(0).text());

                String title = "";
                String priceRow = "";
                for (Element e : value
                ) {
                    PhoneEntity phoneEntity = new PhoneEntity();

                    title = e.attr("title");
                    priceRow = e.attr("data-price");
                    System.out.println(title + ":" + priceRow);


                    phoneEntity.setModel(model.text());
                    phoneEntity.setSpecifications(title);
                    phoneEntity.setPrice(priceRow);


                    phoneRepository.save(phoneEntity);
                }
            }
        }
    }

    public List<PhoneEntity> retrieveAllPhones () {
        List<PhoneEntity> all = phoneRepository.findAll();
        return all;
    }
}




