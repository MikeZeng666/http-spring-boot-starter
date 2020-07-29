package com.mike.springboot.demo.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HttpSelector implements ImportSelector{

	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[] {"com.mike.plugins.httpclient.HttpAutoConfiguration"};
	}

}
