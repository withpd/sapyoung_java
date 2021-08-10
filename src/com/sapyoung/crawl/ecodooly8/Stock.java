package com.sapyoung.crawl.ecodooly8;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {
	public static void main(String[] args ) throws IOException {
		
		
		ArrayList<String> codeList = new ArrayList<>();
		codeList.add("009830");
		codeList.add("005930");
		codeList.add("051910");
		codeList.add("259960");
		codeList.add("086900");
		
		for(int i=0; i<codeList.size(); i++) {
			String code = codeList.get(i);
				
		String url = "https://finance.naver.com/item/main.nhn?code=" + code;
		Document doc = Jsoup.connect(url).get();

		Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
		Element e2 =e1.get(0);
		e2.select("span");
		Elements e3 = e2.select("span");
		
		System.out.println(e3.get(0).text());
		
				
//		Á¾¸ñ¸í
		Elements nameElements = doc.getElementsByAttributeValue("class","wrap_company");
		Elements h2Elements = nameElements.select("h2");
		
		System.out.println(h2Elements.text());
		
		System.out.println();
		
		
	}

}
}
