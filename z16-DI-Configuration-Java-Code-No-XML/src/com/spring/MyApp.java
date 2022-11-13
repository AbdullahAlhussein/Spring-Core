package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String [] arges){

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("SportConfig.class");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();


    }
}
