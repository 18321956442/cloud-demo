package com.lilei.cloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {
    //这是一个测试是否成功的
    //boot -->Spring applicationContext.xml--------@Configuration 配置 ConfigBean = applicationContext.xml
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
