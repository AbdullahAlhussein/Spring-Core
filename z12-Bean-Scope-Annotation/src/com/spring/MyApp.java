package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){

        // load the spring configuration file , create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        // retrieve bean from spring container
        Coach alphaCoach = context.getBean("baseballCoach", Coach.class);

        // check if they are same
        boolean result = (theCoach == alphaCoach);

        // print out the result
        System.out.println(">> Pointing to the same object: " + result );
        System.out.println(">> Memory location for the theCoach: " + theCoach );
        System.out.println(">> Memory location for the alphaCoach: " + alphaCoach );

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();


    }
}
