package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseballCoach implements Coach{

    @Override
   public String getDailyWorkout(){
       return "Spring 30 minutes on batting practice";
   }

   // define my init method
   @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("BaseballCoach: inside method doMyStartupStuff");
    }

    @PreDestroy
    // define my destroy method
    public void doMyCleanupStuff(){
        System.out.println("BaseballCoach: inside method doMyCleanupStuff");
    }
}
