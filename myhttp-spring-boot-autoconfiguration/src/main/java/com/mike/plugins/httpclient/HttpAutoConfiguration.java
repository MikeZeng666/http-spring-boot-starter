package com.mike.plugins.httpclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HttpProperties.class)
public class HttpAutoConfiguration {

	@Autowired
	HttpProperties httpProperties;
	
	@Bean
	public HttpClient httpClient() {
		HttpClient client = new HttpClient();
		client.setUrl(httpProperties.getUrl());
		return client;
	}
}
