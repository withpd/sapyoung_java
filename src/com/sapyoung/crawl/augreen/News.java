package com.sapyoung.crawl.augreen;

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
		
		ArrayList<ArrayList<ArticleDto>>	pageList = new ArrayList<>();

		for (int j = 1; j < page; j++) {  //page ó��

			String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=265&sid1=102&date=20210811&page="
					+ j;
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");

			
			Element element = elements.get(0);
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");

//		System.out.println(photoElements);

			ArrayList<ArticleDto> articleList = new ArrayList<>();
			
			for (int i = 0; i < photoElements.size(); i++) {  //20���� ��� ó��
				ArticleDto aDto = new ArticleDto();
				
				Element articleElement = photoElements.get(i);
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);

				String articleUrl = aElement.attr("href"); // ��縵ũ

				Element imgElement = aElement.select("img").get(0);
				String imgUrl = imgElement.attr("src"); // ������ũ
				String title = imgElement.attr("alt"); // �������

				Document subDoc = Jsoup.connect(articleUrl).get();
				Element contentElement = subDoc.getElementById("articleBodyContents");
				String content = contentElement.text(); // ��系��
				
				
				aDto.setContent(content);
				aDto.setImgUrl(imgUrl);
				aDto.setTitle(title);
				aDto.setUrl(imgUrl);
				
				articleList.add(aDto);
				System.out.println(articleList.size());

//				System.out.println(title);
//				System.out.println(content);
//				System.out.println();
				
			}
			
			pageList.add(articleList);
			System.out.println("pageList sizze : " + pageList.size());
			System.out.println(j + "page ũ�Ѹ� ����");

		}

		// DB�� Insert
		
		
//			System.out.println(title);
//			System.out.println(articleUrl);
//			System.out.println(imgUrl);
//			System.out.println();

//			System.out.println(articleElement);
//			System.out.println("#######################");
//		}

//		System.out.println(photoElements, size());

//		Elements aElements = element.select("a");
//		ELements imgElements = element.select("img");

//		System.out.println(aElements.size());

	}

}