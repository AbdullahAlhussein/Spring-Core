package com.spring;

public class HappyFortunneService implements FortuneService{

    public HappyFortunneService(){
        System.out.println(">> HappyFortunneService inside no-argument constructor");
    }

    @Override
    public String getFortune() {
        return ">> Today is your lucky day!";
    }
}
