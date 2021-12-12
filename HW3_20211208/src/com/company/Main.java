package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int resultadd = add(1, 2, 3, 4);
        printAdd(num1, num2, num3, num4, resultadd);

        double rate = 1.2;
        int dollar = 100;
        double euro = amountEuro(rate, dollar);
        double percenteuro = 2.5;
        double commissionofbanking = operationPercentToEuro(euro, percenteuro);
        double resultexchoper = resultForExchangeOperat(euro, commissionofbanking);

        double result = amountEuro(rate, dollar);
        print(dollar, rate, result, commissionofbanking, percenteuro, resultexchoper);

        System.out.println("\nresult is " + percent(11, 100));


    }

    public static int add(int num1, int num2, int num3, int num4) {
        int resultadd = num1 + num2 + num3 + num4;
        return resultadd;
    }

    public static void printAdd(int num1, int num2, int num3, int num4, int resultadd) {
        System.out.println(("method for adding 4 numbers " + num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + resultadd));
    }


    public static double amountEuro(double rate, int dollar) {
        double result = dollar / rate;
        return result;
    }

    public static double operationPercentToEuro(double euro, double percenteuro) {
        double result = euro * percenteuro / 100;
        return result;
    }

    public static double resultForExchangeOperat(double euro, double commissionofbanking) {
        double resultexc = euro + commissionofbanking;
        return resultexc;
    }

    public static void print(int dollar, double rate, double result, double commissionofbanking, double percenteuro, double resultexchoper) {
        System.out.println("\nFor the payment " + dollar + "$ you need " + result + " Euro" + " \ncommission of banking "
                + commissionofbanking + " Euro" + "\n% commission for every exchange operation " + percenteuro + " %" +
                " \nresult for exchange operation is " + resultexchoper + " Euro");

    }

    public static double percent(double i, double j) {
        double answer = (i * j / 100);
        return answer;
    }

}
