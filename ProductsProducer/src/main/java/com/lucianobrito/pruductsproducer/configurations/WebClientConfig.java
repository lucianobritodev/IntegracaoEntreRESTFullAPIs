package com.lucianobrito.pruductsproducer.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	private final String baseUrl = "http://localhost:8081/consumer";
	
	@Bean
	public WebClient webClient() {
		return WebClient.builder()
			.baseUrl(baseUrl)
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}
	
}
