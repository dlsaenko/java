package javacore.l043.stringsandarray;

import java.util.Arrays;

public class StringsAndArray {
    public static void main(String[] args) {

        char[] str_1 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(str_1));

        str_1[0] = 'R';
        System.out.println(Arrays.toString(str_1));

        String str_2 = "Hello";
        System.out.println(str_2);

        // str_2.charAt(0) = "R"; <--> Строки не изменяемы
    }
}