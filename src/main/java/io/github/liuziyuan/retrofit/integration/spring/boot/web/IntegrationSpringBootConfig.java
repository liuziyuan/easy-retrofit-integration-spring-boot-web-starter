package io.github.liuziyuan.retrofit.integration.spring.boot.web;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegrationSpringBootConfig {

    @Bean
    @ConditionalOnMissingBean
    public GuavaCallAdapterFactoryBuilder guavaCallAdapterFactoryBuilder() {
        return new GuavaCallAdapterFactoryBuilder();
    }

    @Bean
    @ConditionalOnMissingBean
    public PrintInterceptor printInterceptor() {
        return new PrintInterceptor();
    }
}
