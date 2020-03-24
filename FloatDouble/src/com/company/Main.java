package com.company;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Min Float Value = "+myMinFloatValue);
        System.out.println("My Max Float Value =" +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Min Double Value = "+myMinDoubleValue);
        System.out.println("My Max Double Value =" +myMaxDoubleValue);

        int myIntValue= 5/3;
        float myFloatValue= 5f/3f;
        double myDoubleValue=5d/3d;

        System.out.println("MyIntValue ="+myIntValue);
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("MyDoubleValue =" +myDoubleValue);
    }
}
