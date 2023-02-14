package com.example.pricenet.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupPrice {
    public static void main(String[] args) throws IOException {


        Document pageCount = Jsoup.connect("https://qiymeti.net/qiymetleri/telefon/").get();

        Elements page = pageCount.getElementsByClass("page-numbers");

        int size = page.size();

        Element element = page.get(size - 1);

        String pageNumber = element.text();

        for (int i = 1; i <= Integer.parseInt(pageNumber); i++) {

            Document document = Jsoup.connect("https://qiymeti.net/qiymetleri/telefon/page/1/" + i).get();

            Elements div = document.getElementsByClass("archive");
            for (Element element2 : div) {
                Elements minprice = element2.getElementsByClass("min-price");
                Elements model = element2.getElementsByClass("name");
                Elements specifications = element2.getElementsByClass("specifications");


                try {

                    System.out.println(minprice.text() + "++++" + model.text() + "++++" + specifications.text());

                } catch (IndexOutOfBoundsException e) {
                    System.out.println(minprice.text() + "++++" + model.text() + "++++" + specifications.text());
                }

            }


        }
    }
}
