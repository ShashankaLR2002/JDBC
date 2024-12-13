package com.xworkz.admindetailsconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class WebConfiguration {

    public WebConfiguration() {
        System.out.println("WebConfiguration Constructor");
    }


}
