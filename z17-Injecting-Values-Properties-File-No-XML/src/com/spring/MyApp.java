package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String [] arges){

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BaseballCoach.class);

        // retrieve bean from spring container
        BaseballCoach theCoach = context.getBean("baseballCoach", BaseballCoach.class);

        // call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();


    }
}
