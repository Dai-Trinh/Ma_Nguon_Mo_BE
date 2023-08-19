package com.example.manguonmo_be.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON);
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        // Các tùy chọn tùy chỉnh khác
        return objectMapper;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // Xóa tất cả các trình chuyển đổi thông điệp mặc định
        converters.clear();

        // Thêm trình chuyển đổi thông điệp JSON tùy chỉnh (ví dụ: Jackson)
        converters.add(new MappingJackson2HttpMessageConverter());

        // Thêm các trình chuyển đổi thông điệp khác theo nhu cầu
        // converters.add(new YourCustomMessageConverter());
    }
}