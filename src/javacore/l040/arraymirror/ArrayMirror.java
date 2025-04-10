package javacore.l040.arraymirror;

import java.util.Arrays;

public class ArrayMirror {
    public static void main(String[] args) {

        int[] array = {2, 35261, 221, 3743, 312, 2, 436457, 846, 846865, 3523, 2, 14, 315, 368, 5698, 41};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}