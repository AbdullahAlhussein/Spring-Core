package com.spring;

public class BaseballCoach implements Coach{

    @Override
   public String getDailyWorkout(){
       return "Spring 30 minutes on batting practice";
   }

   // add an init method
    public void doMyStartupStuff(){
        System.out.println("BaseballCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("BaseballCoach: inside method doMyCleanupStuff");
    }
}
