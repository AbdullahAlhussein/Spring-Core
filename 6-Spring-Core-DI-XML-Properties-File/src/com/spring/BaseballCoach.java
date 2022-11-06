package com.spring;

public class BaseballCoach{

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    //create a no-argument constructor
    public BaseballCoach(){
        System.out.println("BaseballCoach inside no-argument constructor ");
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

}
