package javacore.l034.cyclesandarrays;

import java.util.Arrays;

public class CyclesAndArrays {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(array) + "\n");

        for (int i = 0; i < array.length; i++) { //fori
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        for (int i : array) { //array.for
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = array.length - 1; i >= 0; i--) { //array.forr
            System.out.print(array[i] + " ");
        }
    }
}