package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseballCoach implements Coach{

    // define a private field for the dependency
    public FortuneService fortuneService;

    // define a constructor for dependency injection
    @Autowired
    public BaseballCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}