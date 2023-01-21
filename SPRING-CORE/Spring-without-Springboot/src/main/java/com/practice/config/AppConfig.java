package com.practice.config;

import com.practice.dto.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.practice"})
public class AppConfig {

    @Bean
    public DemoBean demoBean(){
        return new DemoBean();
    }
}
