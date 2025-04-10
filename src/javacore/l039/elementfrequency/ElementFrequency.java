package javacore.l039.elementfrequency;

public class ElementFrequency {
    public static void main(String[] args) {

        int[] array = {2, 35261, 221, 3743, 312, 2, 436457, 846, 846865, 3523, 2, 14, 315, 368, 5698, 2};
        int x = 2;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result++;
            }
        }
        System.out.println("Частота элемента " + "'" + x + "'" + " в массиве = " + result);
    }
}