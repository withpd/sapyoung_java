package com.sapyoung.crawl.withpd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sapyoung.dto.ArticleDto;

public class NewsMap {
	public static void main(String[] args) throws IOException {
		
		int page = 5;
		
		HashMap<Integer, ArrayList<ArticleDto> > articleMap = new HashMap<>(); 
		
		for(int j = 1; j < page; j++) {		// page 처리
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=265&sid1=100&date=20210811&page=" + j;
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			Element element = elements.get(0);
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
			
			ArrayList<ArticleDto> articleList = new ArrayList<ArticleDto>();
			
			for(int i=0; i<photoElements.size(); i++) {		// 20건의 기사 처리
				ArticleDto aDto = new ArticleDto();
				
				Element articleElement = photoElements.get(i);
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);
				
				String articleUrl = aElement.attr("href");		// 기사링크
				
				Element imgElement = aElement.select("img").get(0);
				String imgUrl = imgElement.attr("src");			// 사진링크
				String title = imgElement.attr("alt");			// 기사제목
				
				Document subDoc = Jsoup.connect(articleUrl).get();
				Element contentElement = subDoc.getElementById("articleBodyContents");
				String content = contentElement.text();			// 기사내용
			
				aDto.setContent(content);
				aDto.setImgUrl(imgUrl);
				aDto.setTitle(title);
				aDto.setUrl(url);

				articleList.add(aDto);
			}
			
			articleMap.put(j, articleList);
			System.out.println(j + "page 크롤링 종료");
		}
		
		// DB에 Insert
		
		
	}
}
