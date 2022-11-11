package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    // define a private field for the dependency injection
    @Autowired
    //No qualifying bean of type 'com.spring.FortuneService' available: expected single matching bean but found 3: happyFortunneService,RESTFortuneServies,randomFortuneService
    //You must select
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout(){
        return ">> Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
