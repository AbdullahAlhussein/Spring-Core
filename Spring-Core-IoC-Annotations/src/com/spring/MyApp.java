package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){


        // read the spring configuration file , create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from spring container
        Coach thecoach = context.getBean("theBaseballCoach", Coach.class);

        // call methods on the bean
        System.out.println(thecoach.getDailyWorkout());

        // close the context
        context.close();


    }
}
