package com.example.pricenet.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupItemWashingMachine {
    public static void main(String[] args) throws IOException {


        Document pageCount = Jsoup.connect("https://qiymeti.net/qiymetleri/paltaryuyan/").get();

        Elements page = pageCount.getElementsByClass("page-numbers");

        int size = page.size();

        Element element = page.get(size - 1);

        String pageNumber = "1";

        for (int i = 1; i <= Integer.parseInt(pageNumber); i++) {

            Document document = Jsoup.connect("https://qiymeti.net/qiymetleri/paltaryuyan/page/" + i).get();

            Elements products = document.getElementsByClass("product");
            for (Element product : products) {
                Elements minprice = product.getElementsByClass("min-price");
                Elements model = product.getElementsByClass("name");
                Elements specifications = product.getElementsByClass("specifications");


                Elements href = product.getElementsByClass("thumbnail");
                href = href.get(0).getElementsByTag("a");
                String attr = href.attr("href");


                Document document2 = Jsoup.connect("https://qiymeti.net/paltaryuyan/" + attr).get();
                Elements elements = document2.getElementsByClass("spec-values");
                System.out.println(elements.get(0).text());

                Elements priceElements = document2.getElementsByClass("price-row");
                for (Element e : priceElements
                ) {
                    String attr1 = e.attr("data-price");
                    System.out.println(attr1);


                }
            }
        }
    }
}
