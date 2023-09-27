package br.com.adssearch.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.adssearch.dto.SearchGoogleDTO;

public class ScrapingUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(ScrapingUtil.class);
	private static final String BASE_URL_GOOGLE = "https://www.google.com/search?q=";
	private static final String COMPLEMENTO_URL_GOOGLE = "&hl=pt-BR";
	
	
	public static void main(String[] args) {
		String url = BASE_URL_GOOGLE + "earn+btc" + COMPLEMENTO_URL_GOOGLE;
		
		ScrapingUtil scraping = new ScrapingUtil();
		scraping.obtemInformacoesCampanhas(url);
		
	}
	public SearchGoogleDTO obtemInformacoesCampanhas(String url) {
		SearchGoogleDTO pesquisa = new SearchGoogleDTO();
		
		Document document = null;
		
		try {
			document = Jsoup.connect(url).get();
			
			String title = document.title();
			LOGGER.info("Titulo página {}", title);
			
		} catch (IOException e) {
			LOGGER.error("ERRO AO CONECTAR AO GOOGLE COM JSOUP -> {}", e.getMessage());
			e.printStackTrace();
		}
		

		return pesquisa;
	}

}
