package com.kodilla.good.patterns.challenges;

public class MyInformationService implements InformationService{

    public void inform(User user){
        System.out.println("Sending mail to:"+user.getUserName()+" "+user.getUserSurname());
    }

}
