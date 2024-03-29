package com.example.pricenet.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class  JSoupItemAC {
    public static void main(String[] args) throws IOException {


        Document pageCount = Jsoup.connect("https://qiymeti.net/qiymetleri/kondisioner/").get();

        Elements page2 = pageCount.getElementsByClass("page-numbers");

        int size = page2.size();

        Element element = page2.get(size - 1);

        String pageNumber = "1";

        for (int i = 1; i <= Integer.parseInt(pageNumber); i++) {

            Document document = Jsoup.connect("https://qiymeti.net/qiymetleri/kondisioner/page/" + i).get();

            Elements ac = document.getElementsByClass("product");
            for (Element product : ac) {
                Elements minPrice1 = product.getElementsByClass("min-price");
                Elements model = product.getElementsByClass("name");
                Elements specifications = product.getElementsByClass("specifications");


                Elements href = product.getElementsByClass("thumbnail");
                href = href.get(0).getElementsByTag("a");
                String attr = href.attr("href");


                Document document2 = Jsoup.connect("https://qiymeti.net/kondisioner/" + attr).get();
                Elements elements = document2.getElementsByClass("product-name");
                System.out.println(elements.get(0).text());

//
//                Elements priceElements = document2.getElementsByClass("price-row");
//                for (Element e : priceElements
//                ) {
//                    String attr3 = e.attr("data-price");
//                    System.out.println(attr3);
//                }
            }
        }
    }
}

