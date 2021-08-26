package com.sapyoung.crawl.hooni7777;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ArrayList<String> codeList = new ArrayList<>();
		codeList.add("035720");
		codeList.add("005930");
		codeList.add("035420");
		codeList.add("000660");
		
		while(true) {
		
		for(int i=0; i<codeList.size(); i++) {
			String code = codeList.get(i);
			

			String url = "https://finance.naver.com/item/main.nhn?code=" + code;
			Document doc = Jsoup.connect(url).get();
			
			// �����
			Elements nameElements = doc.getElementsByAttributeValue("class", "wrap_company");
			Elements h2Elements = nameElements.select("h2");
					
			System.out.println("����� : " + h2Elements.text());
			
			// ���簡
			Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
			Element e2 = e1.get(0);
			Elements e3 = e2.select("span");
			
			System.out.println("���簡 : " + e3.get(0).text() + " ��");
			
			System.out.println();
			}
				Thread.sleep(600000);
		}
	}
}