//package com.graduate_ok.graduate_ok.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//        //        .allowedOrigins("http://localhost:3000", "http://13.125.25.62:3000")
//
////                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
//                .allowedMethods("*")
//                .maxAge(3000)
//                .allowedHeaders("*");
//    }
//
//}