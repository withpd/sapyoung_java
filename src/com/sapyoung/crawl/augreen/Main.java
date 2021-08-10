package com.sapyoung.crawl.augreen;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		StockMain stockMain = new StockMain();
		stockMain.init("086900");
		String result = stockMain.getResult();
		System.out.println(result);
	}	
		
}		
	
		
		
		
