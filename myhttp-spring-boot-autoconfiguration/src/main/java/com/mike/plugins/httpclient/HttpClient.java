package com.mike.plugins.httpclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient {

	private String url;
	
	public String getHtml() {
		try {
			URL url = new URL(this.url);
			URLConnection urlConnection = url.openConnection();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = br.readLine()) != null) {
				sb.append(line).append("\r\n");
			}
			
			return sb.toString();
					
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
