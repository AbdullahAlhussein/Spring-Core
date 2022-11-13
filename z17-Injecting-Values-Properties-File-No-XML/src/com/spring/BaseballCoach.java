package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class BaseballCoach{


    @Value("${foo.email}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;

    //create a no-argument constructor
    public BaseballCoach(){
        System.out.println(">> BaseballCoach inside no-argument constructor ");
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println(">> CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

}
