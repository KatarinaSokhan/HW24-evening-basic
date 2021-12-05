package com.company;

public class Main {

    public static void main(String[] args) {
       /* System.out.println("1" + "2" + "3");// 123
        System.out.println("1" + 2 + 3);// 123
        System.out.println("1" + (2 + 3));// 15
        System.out.println("1" + 2 + "3");// 123

        */

        String myStringVariable = "this is String variable";
        int num = 139;
        int num2;
        byte num3 = 56; // от -128 до 127
        double doubleVar = 89.99999;

        String str;
        str = "hello";
        num2 = 2;
        String delemiter = "/";

        System.out.println(myStringVariable);
        System.out.println(str);
        System.out.println(str + delemiter + myStringVariable);
        myStringVariable = "Java";
        System.out.println(str + delemiter + myStringVariable);


        myStringVariable = "Ada";
        str = "By";
        System.out.println(str + delemiter + myStringVariable);
        System.out.println(num + num2);
        System.out.println(num - num2);

        var t = 8768;
        var h = "fgh";

    }
}
