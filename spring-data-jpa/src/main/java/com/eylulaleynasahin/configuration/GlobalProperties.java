package com.eylulaleynasahin.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component 
@ConfigurationProperties(prefix = "app")	
public class GlobalProperties {
	
//	@Value("${spring.datasource.url}")
//	private String url;
//	
//	@Value("${spring.datasource.username}")
//	private String username;
//	
//	@Value("${spring.datasource.password}")
//	private String password;
	
	private List<Server> servers;
	
	@Value("${key}")
	private String key;
}
