package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("number as String = "+numberAsString);

        int number =Integer.parseInt(numberAsString);
        System.out.println("number = "+number);

        numberAsString +=1;
        number +=1;

        System.out.println("number as String after + 1 = "+numberAsString);
        System.out.println("number+1 = "+number);

        String numberString = "2018.124";
        System.out.println("number as String = "+numberString);

        double doublenumber =Double.parseDouble(numberString);
        System.out.println("number = "+doublenumber);

        numberString +=1;
        doublenumber +=1;

        System.out.println("number as String after + 1 = "+numberString);
        System.out.println("number+1 = "+doublenumber);

    }
}
