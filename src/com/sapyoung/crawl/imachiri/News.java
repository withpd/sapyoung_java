package com.sapyoung.crawl.imachiri;

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

	ArrayList<ArrayList<ArticleDto>> pageList = new ArrayList();
	// 기사 20개씩 갖고 있는 페이지들을 모아둔 어레이리스트.
	
	for(int j=1; j < page; j++) { //페이지 처리를 위한 for문
		
		String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20210811&page=" + j;

		Jsoup.connect(url).get();
		Document doc = Jsoup.connect(url).get();
		Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
		// Element는 html 태그를 의미함.
		// Elements는 html 태그를 여러 개 관리하는 클래스 
		// Attribute는 태그의 속성 값. 예를 들어 <a> 태그의 속성값은 <h ref = "https://www.naver.com"> 부분
		
		Element element = elements.get(0);
		Elements photoElements = doc.getElementsByAttributeValue("class", "photo");
		
		ArrayList<ArticleDto> articleList = new ArrayList<>();
		
		for(int i=0; i<photoElements.size(); i++) {  // 기사를 처리하기 위한 for문
			ArticleDto aDto = new ArticleDto();
					
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
			
			aDto.setContent(content);
			aDto.setImgUrl(imgUrl);
			aDto.setTitle(title);
			aDto.setUrl(url);

			articleList.add(aDto);
			System.out.println(articleList.size());
		}
		pageList.add(articleList);
		System.out.println("size of the pagelist" + " : " + pageList.size());		
		System.out.println(j + "page 크롤링 종료");
	}

	// 크롤링을 통해 모은 데이터를 DB에 넣어주어야 함. 
		
}
}
