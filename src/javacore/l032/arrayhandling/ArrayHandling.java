package javacore.l032.arrayhandling;

import java.util.Arrays;

public class ArrayHandling {
    public static void main(String[] args) {

        int[] array = {52, 3, 18, 9, 74, 999};
        System.out.println("Длинна массива 'array' равна " + array.length + " элементам");

        if (array[4] == 74) {
            System.out.println("Четвертый элемент массива равен 74");
        }

        System.out.println(Arrays.toString(array));
        System.out.println(array[2]);
        System.out.println(array[4]);
        System.out.println(array[array.length - 1]); //Когда неизвестно сколько элементов в массиве
    }
}