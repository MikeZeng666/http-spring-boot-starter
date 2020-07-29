package com.mike.springboot.demo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mike.springboot.demo.service.HttpService;

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Resource
	private HttpService service;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    public void run(String... strings) throws Exception {
    	System.out.println("CommandLineRunner的run方法");
    	service.hello();
    }
}
