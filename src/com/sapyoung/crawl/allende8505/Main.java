package com.sapyoung.crawl.allende8505;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sapyoung.crawl.withpd.StockMain;

public class Main {
	public static void main(String[] args) throws IOException {
		StockMain stockMain = new StockMain();
		stockMain.init("323410");
		String result = stockMain.getResult();
		System.out.println(result);
	}
}
