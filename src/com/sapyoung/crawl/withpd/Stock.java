package com.sapyoung.crawl.withpd;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ArrayList<String> codeList = new ArrayList<>();
		codeList.add("323410");
		codeList.add("005930");
		codeList.add("051910");
		codeList.add("259960");
		codeList.add("086900");
		
		while(true) {
			for(int i=0; i<codeList.size(); i++) {
				String code = codeList.get(i);
				
				String url = "https://finance.naver.com/item/main.nhn?code=" + code;
				Document doc = Jsoup.connect(url).get();
				
				// 종목명
				Elements nameElements = doc.getElementsByAttributeValue("class", "wrap_company");
				Elements h2Elements = nameElements.select("h2");
				System.out.println("종목명 : " + h2Elements.text());
	
				// 현재가
				Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
				Element e2 = e1.get(0);
				Elements e3 = e2.select("span");
				System.out.println("현재가 : " + e3.get(0).text());
				
				System.out.println();
			}
			Thread.sleep(5000);
		}
		
	}
}
