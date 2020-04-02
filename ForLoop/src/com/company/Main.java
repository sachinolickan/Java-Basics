package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            System.out.println("10000 at "+i+"% interest = "+calculateInterest(10000,i));
        }

        int count =0;
        for(int i =10;i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println(i+" is a prime number");
                if(count==3){
                    System.out.println("existing loop");
                    break;
                }
            }
        }
    }

    public  static  double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int number){
        if(number==1) {
           return  false;
        }

        for(int i=2;i<=number/2;i++){
            if(number % i ==0){
                return false;
            }
        }
        return  true;
        }
}
