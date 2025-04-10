package javacore.l036.arraycopying;

import java.util.Arrays;

public class ArrayCopying {
    public static void main(String[] args) {

        int[] arrayX = {0, 35261, 221, 3743, 4, 312, 4, 436457, 846, 846865, 3523, 413, 315, 368, 5698};
        int[] arrayY = new int[arrayX.length];

        System.out.println(Arrays.toString(arrayX));
        System.out.println(Arrays.toString(arrayY));

        //for (int i = 0; i < arrayX.length; i++) {
        //    arrayY[i] = arrayX[i];
        //}
        
        System.arraycopy(arrayX, 0, arrayY, 0, arrayY.length);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(Arrays.toString(arrayX));
        System.out.println(Arrays.toString(arrayY));
    }
}