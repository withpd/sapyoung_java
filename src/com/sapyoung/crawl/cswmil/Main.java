package com.sapyoung.crawl.cswmil;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		StockMain stockMain = new StockMain();
		stockMain.init(null);;
		String result = stockMain.getResult();
		System.out.println(result);
			
	}

}
