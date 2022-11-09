package com.spring;

public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    //create a no-argument constructor
    public BaseballCoach(){
        System.out.println(">> BaseballCoach inside no-argument constructor ");
    }

    // our setter for dependency injection
    public void setFortuneService(FortuneService fortuneService){
        System.out.println(">> BaseballCoach inside method - setFortuneService ");
        this.fortuneService = fortuneService;
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
