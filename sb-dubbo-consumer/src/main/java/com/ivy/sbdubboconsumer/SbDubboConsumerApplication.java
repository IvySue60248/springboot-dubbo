package com.ivy.sbdubboconsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ivy")
@EnableDubboConfiguration
public class SbDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbDubboConsumerApplication.class, args);
    }

}
