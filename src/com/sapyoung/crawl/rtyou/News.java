package com.sapyoung.crawl.rtyou;

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
		//array list�ȿ� �� arraylist �� ��
		ArrayList<ArrayList<ArticleDto>> pageList = new ArrayList<>();
		
		
		for (int j = 1; j < page; j++){
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20210811&page" + j;
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");

			Element element = elements.get(0); // ������ �������� 1�� �ΰ� �˰� ���� ������Ʈ �ܼ��� ġȯ
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
			
			ArrayList<ArticleDto> articleList = new ArrayList<>();
			
			// System.out.println(photoElements);

			for (int i = 0; i < photoElements.size(); i++) {
				ArticleDto aDto = new ArticleDto();
				
				
				Element articleElement = photoElements.get(i);
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);
				

				String articleUrl = aElement.attr("href"); // ��� ��ũ
				

				Element imgElement = aElement.select("img").get(0);
				String imgUrl = imgElement.attr("src"); // ���� ��ũ
				String title = imgElement.attr("alt"); // �������

				Document subDoc = Jsoup.connect(articleUrl).get();
				Element contentElement = subDoc.getElementById("articleBodyContents");		
				String content = contentElement.text(); // ��� ����
				
				aDto.setContent(content);
				aDto.setImgUrl(imgUrl);
				aDto.setTitle(title);
				aDto.setUrl(url);
				
				articleList.add(aDto); // ��������� aDto �־��� �ڷ� Ȯ���� ��� ����Ʈ �ֱ� 
				System.out.println(articleList.size());
				

				System.out.println(contentElement.text());

				System.out.println(title);
				System.out.println(content);
				System.out.println();

			}
			pageList.add(articleList);
			System.out.println("pageList size :" + pageList.size());
			System.out.println(j + "the end");

			// System.out.println(articleElement);
			// System.out.println("########################");

		}

		// System.out.println(elements);

		// Elements aElements = element.select("a"); // ��� 20���� ���� a ���(��系��)
		// Elements imgElements = element.select("img"); 

		// System.out.println(aElements.size()); ����� �˾ƺ��� ����

		// System.out.println(aElements.size());

	}

}
