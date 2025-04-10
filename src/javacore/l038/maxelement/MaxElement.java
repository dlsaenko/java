package javacore.l038.maxelement;

public class MaxElement {
    public static void main(String[] args) {

        int[] array = {999, 35261, 221, 3743, 312, 436457, 846, 846865, 3523, 14, 315, 368, 5698, 2};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.println("max - " + max);
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива = " + max);
        System.out.println("-------------------------------------");

        // +MinElement
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println("min - " + min);
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
    }
}