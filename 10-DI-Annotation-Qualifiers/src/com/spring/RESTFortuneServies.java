package com.spring;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneServies implements FortuneService{

    public RESTFortuneServies(){
        System.out.println(">> RESTFortuneServies inside no-argument constructor");
    }

    @Override
    public String getFortune() {
        return ">> Today is your lucky day!";
    }
}
