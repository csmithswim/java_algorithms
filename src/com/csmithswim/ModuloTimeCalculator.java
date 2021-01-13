package com.csmithswim;

public class ModuloTimeCalculator {
    //Version 1
    static void convertHours(int hours, int minutes, int hoursPassed){
        int finalHours = (hours+(hoursPassed%24))%24;
        System.out.println(finalHours+":"+minutes);
    }

    static void convertMinutes(int hours, int minutes, int minutesPassed){
        int finalHours = hours + minutes + (minutesPassed/60);
        int finalMinutes = (minutesPassed%60);
        System.out.println(finalHours+":"+finalMinutes);
    }

    static void convertHours(int hours, int minutes, int hoursPassed, boolean standard){
        int finalHours = (hours+(hoursPassed%24))%24;
        if (standard==true){
            System.out.println(finalHours%12+":"+minutes);
        }
        else System.out.println(finalHours+":"+minutes);
    }

    static void convertMinutes(int hours, int minutes, int minutesPassed, boolean standard){
        int finalHours = hours  + (minutesPassed/60);
        int finalMinutes = (minutesPassed+minutes)%60;
        if (standard==true){
            System.out.println(finalHours%12+":"+finalMinutes);
        }
        else System.out.println(finalHours+":"+finalMinutes);
    }

}
