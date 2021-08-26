package com.sapyoung.crawl.rtyou;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		StockMain stockMain = new StockMain();
		stockMain.init(null);;  // 스톡 메인 작업분 필요함 아직 연결 안 되어 있음
		String result = stockMain.getResult();
		System.out.println(result);
		
		Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
		System.out.println(doc);
//		System.out.println(doc.title());
//		Elements newsHeadlines = doc.select("#mp-itn b a");
//		for (Element headline : newsHeadlines) {
//			System.out.println(headline.attr("title"));
//			System.out.println(headline.absUrl("href"));
//			
			
		
		}
		
		
		
	}
	
	
	
//}
