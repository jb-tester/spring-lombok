package com.mytests.spring.springlombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringLombokApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringLombokApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        MyDataClass data = ctx.getBean(MyDataClass.class);
        ConfigProperties cp = ctx.getBean(ConfigProperties.class);
        System.out.println(data.getId() + data.getName() + data.getAddress());
        System.out.println(cp.getBar());
    }
}
