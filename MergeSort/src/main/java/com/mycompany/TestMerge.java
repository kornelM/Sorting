package com.mycompany;

import java.util.Arrays;
import java.util.Random;

public class TestMerge {

    public static void main(String[] args) {

        Random r = new Random();

        int size = 1000;

        int[] testArray = new int[size];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(size + 10);
        }

        System.out.println("MergeSort");
        long start = System.currentTimeMillis();
        TestMerge.printArray(testArray);
        System.out.println();
        MergeSort.sort(testArray);
        TestMerge.printArray(testArray);
        System.out.println("\nTime (milisec): " + (System.currentTimeMillis()-start));

    }

    public static void printArray(int[] table){
        for (int i = 0; i < table.length; i++) {
            System.out.printf(String.valueOf(table[i])+" ");
        }
    }
}
