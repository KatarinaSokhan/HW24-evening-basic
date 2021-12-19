package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String var1 = "hello";
        String var2 = "hello";

        int a = 10;
        int b = 2;

        int month = 5;

        int time = 21;
        boolean isDoorOpen = true;
        System.out.println("Should go off to alarm: " + checkAlarmController(time, isDoorOpen));

        System.out.println(isHelloPresent(var1, var2));
        //System.out.println(a % b);
        System.out.println(a + " is divisible by " + b + " without any remainder " + checkDiv(a, b));

        System.out.println(month + " is month number " + (checkMonth(month)));


    }

    public static boolean isHelloPresent(String var1, String var2) {
        if (var1 == "hello" || var2 == "hello") {
            return true;
        }
        return false;
    }
    //1 Implement the method that returns true if one of its two arguments is equal “hello”


    public static boolean checkDiv(int a, int b) {
        return ((a % b) == 0);
    }
    // 2  checks if [int a] is divisible by [int b] without any remainder or not

    public static boolean checkMonth(int month) {
        return (month >= 1 && month <= 12);
    }
    // that takes an integer and returns true, if this int can be interpreted as month number, else returns false

    public static boolean checkAlarmController(int time, boolean isDoorOpen) {
        if (!isDoorOpen) {
            return false;
        }
        if (((time >= 22 && time <= 24) || (time >= 0 && time <= 7))) {
            return true;
        }
        return false;
    }
}



