package com.generate.toy.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfigurer implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOriginPatterns("*")
		.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
		.allowedHeaders("*")
		.allowCredentials(true);
		
	}
	
}
