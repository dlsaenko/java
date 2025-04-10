package javacore.l033.arrayserror;

import java.util.Arrays;

public class ArraysError {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4};

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива - " + array.length);
        System.out.println(array[0]);
        System.out.println(array[4]);

        System.out.println(array[-1]); //Exception
        System.out.println(array[5]);  //Exception
    }
}