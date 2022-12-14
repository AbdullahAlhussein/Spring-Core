package com.spring;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService thefortuneService) {
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
