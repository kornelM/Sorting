package mycompany;

import java.util.Random;

public class TestInsertion {

    public static void main(String[] args) {

        Random r = new Random();

        int size = 1000;

        int[] testArray = new int[size];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(size + 10);
        }

        System.out.println("InsertionSort");
        long start = System.currentTimeMillis();
        //TestInsertion.printArray(testArray);
        System.out.println();
        InsertionSort.sort(testArray);
        //TestInsertion.printArray(testArray);
        System.out.println("\nTime (milisec): " + (System.currentTimeMillis()-start));

    }

    public static void printArray(int[] table){
        for (int i = 0; i < table.length; i++) {
            System.out.printf(String.valueOf(table[i])+" ");
        }
    }
}
