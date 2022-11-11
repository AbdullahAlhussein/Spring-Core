package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String [] arges){


        // load the spring configuration file , create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // retrieve bean from spring container
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are same
        boolean result = (theCoach == alphaCoach);

        // print out the result
        System.out.println("\n >> Pointing to the same object: " + result);

        System.out.println("\n >> Memory location for theCoach: " + theCoach);
        System.out.println("\n >> Memory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();


    }
}
