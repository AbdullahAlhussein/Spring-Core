package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){

//        // load the spring configuration file , create a Spring container
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        // retrieve bean from spring container
//        Coach thecoach = context.getBean("myCoach", Coach.class);

        Coach dd = new BaseballCoach();
        // let's call our new method for fortunes
        System.out.println(thecoach.getDailyFortune());

        // close the context
        context.close();


    }
}
