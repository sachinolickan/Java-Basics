package com.company;

public class Main {

    public static void main(String[] args) {

        String myString ="This is my first string";
        System.out.println("Hey there, "+myString);
        myString = myString + ",and my second string";
        System.out.println(myString);
        String numberString ="40.56";
        numberString = numberString + "10";
        System.out.println("This is the number string =" +numberString);
        int myInt = 50;
        String myNewString ="10.45";
        myNewString =myNewString+myInt;
        System.out.println("here is the  lastString "+myNewString);
    }
}
