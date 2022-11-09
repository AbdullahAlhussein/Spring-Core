package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    @Autowired
    public BaseballCoach(FortuneService thefortuneService){
        System.out.println(">> BaseballCoach inside no-argument constructor");
        fortuneService = thefortuneService;
    }

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
