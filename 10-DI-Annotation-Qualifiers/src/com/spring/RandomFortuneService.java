package com.spring;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

    public RandomFortuneService(){
        System.out.println(">> RandomFortuneService inside no-argument constructor");
    }

    @Override
    public String getFortune() {
        return ">> Today is your lucky day! + RandomFortuneService";
    }
}
