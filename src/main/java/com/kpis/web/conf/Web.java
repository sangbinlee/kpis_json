package com.kpis.web.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Web implements WebMvcConfigurer  {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//        	.addResourceHandler("/webjars/**")
//            .addResourceLocations("classpath:/META-INF/resources/webjars/")
////            .addResourceLocations("/webjars/")
//                .resourceChain(false)
//            ;
//        registry.setOrder(1);
//    }
}