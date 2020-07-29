package com.mike.plugins.httpclient;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="http")
public class HttpProperties {

	private String url;
	private int timeout;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}
