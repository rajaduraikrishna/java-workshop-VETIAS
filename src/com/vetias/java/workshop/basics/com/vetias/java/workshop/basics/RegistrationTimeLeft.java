package com.vetias.java.workshop.basics;
import java.time.LocalTime;
public class RegistrationTimeLeft {

    public static void main(String[] args) {
       LocalTime currentTime = LocalTime.now();
       LocalTime registrationEndTime = LocalTime.of(18, 59,59); // Registration ends at 23:59
        int hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
        int minutesLeft = registrationEndTime.getMinute() - currentTime.getMinute();
        int secondsLeft = registrationEndTime.getSecond() - currentTime.getSecond();    
       System.out.print("You have " + hoursLeft + " hours, " 
                        + minutesLeft + " minutes, and " 
                        + secondsLeft + " seconds left to register.");
        

    }  


}
