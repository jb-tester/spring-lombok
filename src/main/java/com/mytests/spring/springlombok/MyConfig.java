package com.mytests.spring.springlombok;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 6/23/2021.</p>
 * <p>Project: spring-lombok</p>
 * *
 */
@Configuration
public class MyConfig {

    @Bean
    public MyDataClass data() {
        return new MyDataClass("foo",1,"bar");
    }
}
