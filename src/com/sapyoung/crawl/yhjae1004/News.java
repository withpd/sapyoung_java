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
		
		for(int j=1; j < page; j++) { // ������ ó��
		
			String url = "https://news.naver.com/main/list.naver?mode=LSD&mid=sec&sid1=100&date=20210811&page" + j;
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.getElementsByAttributeValue("class","list_body newsflash_body");
//			System.out.println(elements.size()); //elements�� �ϳ����� ���� ������ �˾ƺ� �� �ֵ��� size �ż���� Ȯ�� �� get(0).
			Element element = elements.get(0);
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
			
			ArrayList<ArticleDto> articleList = new ArrayList<>();
			
			for(int i=0; i<photoElements.size(); i++) { // 20 ���� ��� ó��
				ArticleDto aDto = new ArticleDto();
				
				Element articleElement = photoElements.get(i);
				Elements aElements = articleElement.select("a"); // a �±� ��������
//				System.out.println(aElements.size()); // �� �κп� ��Ұ� �� ���� �ִ��� size �ż���� Ȯ�� �� get(0).
				Element aElement = aElements.get(0);
				
				String articleUrl = aElement.attr("href"); // attr=attribute
//				System.out.println(articleUrl);	// ��� ��ũ
				
				Element imgElement = aElements.select("img").get(0);
				String imgUrl = imgElement.attr("src"); // ���� ��ũ
				String title = imgElement.attr("alt"); // ��� ����
				
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
			System.out.println(j+ "page ũ�Ѹ� ����");
		}
		
//		Elements aElements = element.select("a"); // a �±� ��������
//		Elements imgElements = element.select("img"); // img �±� ��������
		
//		System.out.println(aElements);
	}
}

		// DB Insert



