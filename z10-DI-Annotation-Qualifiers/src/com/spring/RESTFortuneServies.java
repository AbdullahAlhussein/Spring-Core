package com.spring;

import org.springframework.stereotype.Component;

//default component name same name class and first Letter small
@Component
public class RESTFortuneServies implements FortuneService{

    // define a default constructor
    public RESTFortuneServies(){
        System.out.println(">> RESTFortuneServies inside no-argument constructor");
    }

    @Override
    public String getFortune() {
        return ">> Today is your lucky day!";
    }
}
