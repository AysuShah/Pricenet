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

        }
    }
}

