package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth :" );

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yob = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter Key)
            int age =2020 -yob;

            System.out.println("Enter Your name: ");
            String name = scanner.nextLine();

            if(age >0 && age <=100){
                System.out.println("Your Name : "+name);
                System.out.println("Your age: "+age);
            }
            else{
                System.out.println("Invalid dob");
            }
        } else {
            System.out.println("Unable to parse year input");
        }


        scanner.close();
    }
}
