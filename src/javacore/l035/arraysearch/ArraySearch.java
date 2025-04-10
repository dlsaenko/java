package javacore.l035.arraysearch;

public class ArraySearch {
    public static void main(String[] args) {

        int[] array = {0, 35261, 221, 3743, 4, 312, 4, 436457, 846, 846865, 3523, 413, 315, 368, 5698};
        //             0    1     2     3   4   5   6     7     8      9     10    11   12   13   14
        //                                                      ^
        //                                                    xIndex
        int x = 846;
        int xIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                xIndex = i;
                break;
            }
            System.out.println(i);
        }
        System.out.println("xIndex - " + xIndex);
    }
}