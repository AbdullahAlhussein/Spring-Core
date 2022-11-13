package com.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class BaseballCoach implements Coach{

    // create a no-arg constructor
    public BaseballCoach() {
        System.out.println(">> BaseballCoach: inside no-arg constructor");
    }

    @Override
   public String getDailyWorkout(){
       return ">> Spring 30 minutes on batting practice";
   }

}
