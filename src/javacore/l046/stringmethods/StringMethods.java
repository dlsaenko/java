package javacore.l046.stringmethods;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String myStr = "Hello World!";
        String myStr_2 = myStr.toUpperCase();
        String myStr_3 = "      Hello World!";

        //Методы: tuUpperCase() и toLowerCase()
        System.out.println(myStr);
        System.out.println(myStr.toUpperCase());    //Приводит все элементы к верхнему регистру
        System.out.println(myStr.toLowerCase());    //Приводит все элементы к нижнему регистру
        System.out.println("-----------------");
        System.out.println(myStr);

        //Методы: repeat() и replace()
        System.out.println(myStr.repeat(2)); //Повторяет строку заданное число раз
        System.out.println(myStr.replace("Hello", "Ralli")); //Заменяет содержимое строки

        //Метод substring()
        System.out.println(myStr.substring(6, 9));   //Выводит содержимое определенных индексов

        //Метод split()
        System.out.println(Arrays.toString(myStr.split(" "))); //[Hello <[0], World! ,[1]] пробел вырезается и
        //                                                              становится разделителем элементов в массиве
        String intString = "123456789";
        System.out.println(Arrays.toString(intString.split("5"))); //Вывод [1234, 6789]

        //Методы trim() и strip()
        System.out.println(myStr_3.trim());  //Убирает отступы в начале и в конце
        System.out.println(myStr_3.strip()); //Улучшенная версия trim()
    }
}