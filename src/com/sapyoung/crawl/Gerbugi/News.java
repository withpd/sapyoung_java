package com.sapyoung.crawl.Gerbugi;

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
		
		ArrayList<ArrayList<ArticleDto>> pageList = new ArrayList<>();
		
		for(int j=1; j < page; j++) {                     // page 처리
		
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20210811&page=" + j;
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			Element element = elements.get(0);
			Elements photoElements = element.getElementsByAttributeValueContaining("class","photo");
			
			ArrayList<ArticleDto> articleList = new ArrayList<>();
			
			for(int i=0; i<photoElements.size(); i++) {    // 20건의 기사 처리
				ArticleDto aDto = new ArticleDto();
				
				Element articleElement = photoElements.get(i);
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);
				
				String articleUrl = aElement.attr("href"); // 기사링크
				
				Element imgElement = aElement.select("img").get(0); 
				String imgUrl = imgElement.attr("src");    // 사진링크
				String title = imgElement.attr("alt");     // 기사제목
	
				Document subDoc = Jsoup.connect(articleUrl).get();
				Element contentElement = subDoc.getElementById("articleBodyContents");
				String content = contentElement.text();    // 기사내용
				
				aDto.setContent(content);
				aDto.setImgUrl(imgUrl);
				aDto.setTitle(title);
				aDto.setUrl(imgUrl);
				
				articleList.add(aDto);
				System.out.println(articleList.size());
			}
			
			pageList.add(articleList);
			System.out.println("pageList size : " + pageList.size());
			System.out.println(j + "page 크롤링 종료");
		}
		
		//DB에 Insert
		
		
		
		
		
	}
}
