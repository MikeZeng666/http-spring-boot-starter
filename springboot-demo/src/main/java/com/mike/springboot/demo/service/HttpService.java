package com.mike.springboot.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.mike.plugins.httpclient.HttpClient;

@Component
public class HttpService {

	@Resource
	private HttpClient client;
	
	public void hello() {
		System.out.println(client.getHtml());
	}
}
