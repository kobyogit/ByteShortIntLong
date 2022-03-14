package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println ("Int Min Value = " + myMinIntValue);
        System.out.println ("Int Max Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println ("Byte Min Value = " + myMinByteValue);
        System.out.println ("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println ("Short Min Value = " + myMinShortValue);
        System.out.println ("Short Max Value = " + myMaxShortValue);
       
        long myMinLongNumber = Long.MIN_VALUE;
        long myMaxLongNumber = Long.MAX_VALUE;
        System.out.println ("Long Min Value = " + myMinLongNumber);
        System.out.println ("Long Max Value = " + myMaxLongNumber);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        byte byteVal = 20;
        short shortVal = 20000;
        int intVal = 2000000000;
        long longVal = (50000L + 10L * (long)(byteVal + shortVal + intVal));
        System.out.println("long value = " + longVal);

        short shortTotal = (short) (byteVal + shortVal + longVal);
        System.out.println("Busted sort Total = " + shortTotal);
    }
}
