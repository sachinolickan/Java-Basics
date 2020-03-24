package com.company;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00; //step 1
        double secondValue = 80.00; //step 2
        double result = (firstValue + secondValue) * 100.00; //step 3
        double reminder = result % 40.00; //step 4
        System.out.println("the reminder = " + reminder);
        boolean booleanValue = (reminder == 0) ? true : false; //step 5
        System.out.println("boolean Value = " + booleanValue); // step 6

        if (!booleanValue) {  //step 7
            System.out.println("got some reminder");
        }
    }
}
