package com.sapyoung.crawl.withpd;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {
	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "https://finance.naver.com/item/main.nhn?code=005930";
		Document doc = Jsoup.connect(url).get();

		// 종목명
		Elements nameElements = doc.getElementsByAttributeValue("class", "wrap_company");
		Elements h2Elements = nameElements.select("h2");
		System.out.println(h2Elements.text());

		// 현재가
		Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
		Element e2 = e1.get(0);
		Elements e3 = e2.select("span");
		Element e4 = e3.get(0);
		String price = e4.text();
		// System.out.println(price);

	}
}
