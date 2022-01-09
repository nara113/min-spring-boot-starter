package com.study;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(HolomanProperties.class)
@Configuration
public class HolomanConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public Holoman holoman(HolomanProperties holomanProperties) {
        return new Holoman(holomanProperties.getName(), holomanProperties.getAge());
    }
}
