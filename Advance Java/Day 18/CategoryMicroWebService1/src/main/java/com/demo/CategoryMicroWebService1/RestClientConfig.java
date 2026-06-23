package com.demo.CategoryMicroWebService1;



import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    @LoadBalanced
    RestClient restClient() {
    	System.out.println("in restClient function");

        return RestClient.builder()
                .baseUrl("http://localhost:8183")
                .build();
    	/*return RestClient.builder()
                .baseUrl("http://PRODUCT-SERVICE")
                .build();*/
    	
    }
}
