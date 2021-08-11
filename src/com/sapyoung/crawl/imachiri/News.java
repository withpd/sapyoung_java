package com.sapyoung.crawl.imachiri;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class News {
	public static void main(String[] args) throws IOException {
		
	int page = 3;
	for(int j=1; j < page; j++) {
		
		String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20210811&page=" + j;

		Jsoup.connect(url).get();
		Document doc = Jsoup.connect(url).get();
		Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");

		Element element = elements.get(0);
		Elements photoElements = doc.getElementsByAttributeValue("class", "photo");
		
		for(int i=0; i<photoElements.size(); i++) {
			Element articleElement = photoElements.get(i);
			Elements aElements = articleElement.select("a");			
			Element aElement = aElements.get(0);
			String articleUrl = aElement.attr("href"); // 기사링크

			Element imgElement = aElement.select("img").get(0); 
			String imgUrl = imgElement.attr("src"); // 사진링크
			String title = imgElement.attr("alt"); // 기사제목
			
			// 이제 크롤링해서 가져온 기사링크 중 하나를 통해 들어가서, 그 안의 기사 내용을 가져와보자. 
			
			Document subDoc = Jsoup.connect(articleUrl).get();
			Element contentElement = subDoc.getElementById("articleBodyContents");
			String content = contentElement.text(); // 기사 내용
			
			System.out.println(title);
			System.out.println(content);
			System.out.println();
		}
		System.out.println(j + "page 크롤링 종료");
		}
		
		
			}
}
