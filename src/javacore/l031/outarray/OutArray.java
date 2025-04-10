package javacore.l031.outarray;

import java.util.Arrays;

public class OutArray {
    public static void main(String[] args) {

        int[] intArray = {52, 3, 18, 9, 74};
        String[] stringArray = {"string1", "test_text", "123", "Java"};
        boolean[] boolArray = {true, false, false, true, true};

        int[] array = new int[10];
        String[] myStringArray = new String[5];

        int[] myIntArray = {};
        String[] myNewStringArray = {};

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(boolArray));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myNewStringArray));
    }
}