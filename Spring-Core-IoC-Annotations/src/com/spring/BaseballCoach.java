package com.spring;

import org.springframework.stereotype.Component;

@Component("theBaseballCoach")
public class BaseballCoach implements Coach{

    @Override
   public String getDailyWorkout(){
       return "Spring 30 minutes on batting practice";
   }
}
