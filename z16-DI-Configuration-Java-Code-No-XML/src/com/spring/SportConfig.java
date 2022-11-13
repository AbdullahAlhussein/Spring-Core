package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService happyFortunneService() {
        return new HappyFortunneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach baseballCoach() {
        return new BaseballCoach(happyFortunneService());
    }
}
