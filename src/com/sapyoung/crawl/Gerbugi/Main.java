package com.sapyoung.crawl.Gerbugi;

import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		StockMain stockMain = new StockMain();
		stockMain.init("");
		String result = stockMain.getResult();
		System.out.println(result);
	}
}
