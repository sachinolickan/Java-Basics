package com.company;

public class Main {

    public static void main(String[] args) {
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min value =" + myMinIntValue);
        System.out.println("Integer Max value =" + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue+1));
        System.out.println("Busted Min value = " + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min value =" + myMinByteValue);
        System.out.println("Byte Max value =" +myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min value =" + myMinShortValue);
        System.out.println("Short Max value =" +myMaxShortValue);

        long myLongValue =100L;
        System.out.println("My Long value = "+myLongValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min value =" + myMinLongValue);
        System.out.println("Long Max value =" +myMaxLongValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2); //type casting
        short myNewShortValue = (short)(myMinShortValue/2);


    }
}
