package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){


        // load the spring configuration file , create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();


    }
}
