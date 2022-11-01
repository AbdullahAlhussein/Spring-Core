package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String [] arges){

        // read spring java class , create a Spring container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BaseballCoach.class);

        // retrieve bean from spring container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();


    }
}
