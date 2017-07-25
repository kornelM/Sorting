package mycompany;

import java.util.Random;

public class TestHeap {

    public static void main(String[] args) {

        Random r = new Random();

        int size = 1000;

        int[] testArray = new int[size];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(size + 10);
        }

        System.out.println("HeapSort");
        long start = System.currentTimeMillis();
        //TestHeap.printArray(testArray);
        System.out.println();
        HeapSort.sort(testArray);
        //TestHeap.printArray(testArray);
        System.out.println("\nTime (milisec): " + (System.currentTimeMillis()-start));

    }

    public static void printArray(int[] table){
        for (int i = 0; i < table.length; i++) {
            System.out.printf(String.valueOf(table[i])+" ");
        }
    }
}
