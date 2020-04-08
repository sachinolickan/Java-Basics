package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count =1;
        int sum =0;
        Scanner scanner =  new Scanner(System.in);

        while(count<=10){
            System.out.println("Enter number #"+count+":" );

            boolean hasNextINt = scanner.hasNextInt();
            if(hasNextINt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("Sum = "+sum);
        scanner.close();
    }
}
