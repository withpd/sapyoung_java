package com.sapyoung.crawl.unmeblue21;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		StockMain stockMain = new StockMain();
		stockMain.init(null);
		String result = stockMain.getResult();
		System.out.println(result);
		
	}	
}
