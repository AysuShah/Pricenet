package com.example.pricenet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.io.IOException;

public class MainPage {
    public static void main(String[] args) throws IOException {

        Document document = null;

        Document pageCount = Jsoup.connect("https://qiymeti.net/qiymetleri/telefon/").get();


    }
}
