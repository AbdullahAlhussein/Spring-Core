package com.spring;

public class BaseballCoach implements Coach{

    // define a default constructor
    public BaseballCoach(){
        System.out.println(">> BaseballCoach: inside default constructor");
    }

    @Override
   public String getDailyWorkout(){
       return ">> Spring 30 minutes on batting practice";
   }

   // add an init method
    public void doMyStartupStuff(){
        System.out.println(">> BaseballCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println(">> BaseballCoach: inside method doMyCleanupStuff");
    }
}
