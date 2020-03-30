package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("sachin",25);
        System.out.println("Total Score ="+newScore);
        calculateScore(45);
        calculateScore();
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(128);
    }

    public static int calculateScore(String playername,int score) {
        System.out.println(playername +" scored "+score+" points ");
        return score*100;
    }

    public static  void calculateScore(int lscore){
        System.out.println("Level 2 score =" +lscore);
    }

    public static  void calculateScore(){
        System.out.println("No player,no score");
    }

    public static  double calcFeetAndInchesToCentimeters(double feet , double inches){

        if((feet >= 0)&&((inches >= 0)&&(inches <=12))){

            double centimeters = ((feet * 12)*2.54);
            centimeters += (inches*2.54);
            System.out.println(feet+"feet,"+inches+"inches = "+centimeters+"cm");
            return centimeters;
        }
        System.out.println("invalid parameters");
        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >= 0){
            double feet = (int)inches/12;
            double remainingInches = (int)inches%12;
            System.out.println(inches+"inches = "+feet+" feet "+remainingInches+" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return  -1;

    }
}
