package com.sapyoung.crawl.yhjae1004;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sapyoung.dto.ArticleDto;

public class News {
	public static void main(String[] args) throws IOException {
		
		int page = 5; 
		
		for(int j=1; j < page; j++) { // 페이지 처리
		
			String url = "https://news.naver.com/main/list.naver?mode=LSD&mid=sec&sid1=100&date=20210811&page" + j;
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.getElementsByAttributeValue("class","list_body newsflash_body");
//			System.out.println(elements.size()); //elements가 하나인지 여러 개인지 알아볼 수 있도록 size 매서드로 확인 후 get(0).
			Element element = elements.get(0);
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
			
			ArrayList<ArticleDto> articleList = new ArrayList<>();
			
			for(int i=0; i<photoElements.size(); i++) { // 20 건의 기사 처리
				ArticleDto aDto = new ArticleDto();
				
				Element articleElement = photoElements.get(i);
				Elements aElements = articleElement.select("a"); // a 태그 가져오기
//				System.out.println(aElements.size()); // 각 부분에 요소가 몇 개씩 있는지 size 매서드로 확인 후 get(0).
				Element aElement = aElements.get(0);
				
				String articleUrl = aElement.attr("href"); // attr=attribute
//				System.out.println(articleUrl);	// 기사 링크
				
				Element imgElement = aElements.select("img").get(0);
				String imgUrl = imgElement.attr("src"); // 사진 링크
				String title = imgElement.attr("alt"); // 기사 제목
				
				Document subdoc = Jsoup.connect(articleUrl).get();
				Element contentElement = subdoc.getElementById("articleBodyContents");
				String content = contentElement.text();
				
				aDto.setContent(content);
				aDto.setImgUrl(imgUrl);
				aDto.setTitle(title);
				aDto.setUrl(url);
				
				System.out.println(articleList.size());
				
//				System.out.println(title);
//				System.out.println(content);
//				System.out.println(articleUrl);
//				System.out.println(imgUrl);
//				System.out.println();
			}
			System.out.println(j+ "page 크롤링 종료");
		}
		
//		Elements aElements = element.select("a"); // a 태그 가져오기
//		Elements imgElements = element.select("img"); // img 태그 가져오기
		
//		System.out.println(aElements);
	}
}

		// DB Insert



