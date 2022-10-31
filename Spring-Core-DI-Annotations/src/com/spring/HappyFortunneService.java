package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortunneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
