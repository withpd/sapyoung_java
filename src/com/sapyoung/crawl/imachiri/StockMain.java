package com.sapyoung.crawl.imachiri;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sapyoung.common.WorkAb;

public class StockMain extends WorkAb{

	Document doc = null;
	
	@Override
	public void init(String id) {
		String url = "https://finance.naver.com/item/main.nhn?code=" + id;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public String process() {
		
		// 종목명
		Elements nameElements = doc.getElementsByAttributeValue("class", "wrap_company");
		Elements h2Elements = nameElements.select("h2");
//		System.out.println("종목명 : " + h2Elements.text());

		// 현재가
//		Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
//		Element e2 = e1.get(0);
//		Elements e3 = e2.select("span");
//		System.out.println("현재가 : " + e3.get(0).text());
		
		return h2Elements.text();
	}
}
