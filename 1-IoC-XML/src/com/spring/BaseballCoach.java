package com.spring;

public class BaseballCoach implements Coach{

    // define a default constructor
    public BaseballCoach(){
        System.out.println(">> BaseballCoach: inside default constructor");
    }

    @Override
   public String getDailyWorkout(){
       return ">> Spend 30 minutes on batting practice";
   }
}
