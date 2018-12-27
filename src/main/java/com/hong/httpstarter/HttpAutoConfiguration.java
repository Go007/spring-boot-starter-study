package com.hong.httpstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * <br>自动配置类</br>
 */
@Configuration
@EnableConfigurationProperties(HttpProperties.class)
public class HttpAutoConfiguration {
    @Resource
    private HttpProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public HttpClient init(){
        HttpClient httpClient = new HttpClient();
        String url = properties.getUrl();
        httpClient.setUrl(url);
        return httpClient;
    }
}
