package javacore.l042.cyclesandstrings;

import java.util.Arrays;

public class CyclesAndStrings {
    public static void main(String[] args) {

        char[] str_1 = {'H', 'e', 'l', 'l', 'o'};
        String str_2 = "Hello";

        for (int i = 0; i < str_1.length; i++) {
            System.out.print(str_1[i]);
        }

        System.out.print("\t");

        for (int i = 0; i < str_1.length / 2; i++) {
            char temp = str_1[i];
            str_1[i] = str_1[str_1.length - 1 - i];
            str_1[str_1.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(str_1));

        for (int i = 0; i < str_2.length(); i++) {
            System.out.print(str_2.charAt(i));
        }
        System.out.println("");
        System.out.println(str_2.charAt(4));
        System.out.println(Arrays.toString(str_2.toCharArray()));
    }
}