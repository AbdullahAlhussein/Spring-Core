package com.spring;

import org.springframework.stereotype.Component;

//default component name same name class and first Letter small
@Component
public class RandomFortuneService implements FortuneService{

    // define a default constructor
    public RandomFortuneService(){
        System.out.println(">> RandomFortuneService inside no-argument constructor");
    }

    @Override
    public String getFortune() {
        return ">> Today is your lucky day! + RandomFortuneService";
    }
}
