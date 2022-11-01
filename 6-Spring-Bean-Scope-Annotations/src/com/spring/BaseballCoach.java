package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseballCoach implements Coach{

    // define a default constructor
    public BaseballCoach(){
        System.out.println(">> BaseballCoach: inside default constructor");
    }

    @Override
   public String getDailyWorkout(){
       return "Spring 30 minutes on batting practice";
   }


}
