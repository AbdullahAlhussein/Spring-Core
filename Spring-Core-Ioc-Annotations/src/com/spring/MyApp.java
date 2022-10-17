package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){

//        // create the object
//        Coach thecoach = new TrackCoach();
//
//        // use the object
//        System.out.println(thecoach.getDailyWorkout());

        // load the spring configuration file , create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach thecoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(thecoach.getDailyWorkout());

        // close the context
        context.close();


    }
}
