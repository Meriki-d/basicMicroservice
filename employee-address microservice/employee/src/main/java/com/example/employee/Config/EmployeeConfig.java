package com.example.employee.Config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EmployeeConfig {
    @Value("${addressservice.base.url}")
    private String baseurl;
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
    @Bean
    public RestTemplate template(){return new RestTemplate();}
    @Bean
    public WebClient client(){
        WebClient client =WebClient.builder().baseUrl(baseurl).build();
        return client;
    }
}
