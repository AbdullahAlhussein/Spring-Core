package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);

        // call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        // close the context
        context.close();


    }
}
