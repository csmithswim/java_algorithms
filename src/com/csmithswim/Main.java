package com.csmithswim;

public class Main {

    public static void main(String[] args) {
        //Version 1
        System.out.println("Version 1");
        ModuloTimeCalculator.convertHours(8,0,5);
        ModuloTimeCalculator.convertHours(21,0,5);
        ModuloTimeCalculator.convertHours(21,0,36);

        //Version 2
        System.out.println("Version 2");
        ModuloTimeCalculator.convertHours(21,0,-5);

        //Version 3
        System.out.println("Version 3");
        ModuloTimeCalculator.convertMinutes(21,00,147);

        //Version 4
        System.out.println("Version 4");
        ModuloTimeCalculator.convertHours(21,27,2,false);
        ModuloTimeCalculator.convertMinutes(21,0,147,true);

    }
}
