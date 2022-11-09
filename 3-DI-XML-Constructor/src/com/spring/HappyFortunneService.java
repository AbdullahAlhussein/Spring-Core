package com.spring;

public class HappyFortunneService implements FortuneService{

    // define a default constructor
    public HappyFortunneService(){
        System.out.println(">> HappyFortunneService: inside default constructor");
    }

    @Override
    public String getFortune() {
        return ">> Today is your lucky day!";
    }
}
