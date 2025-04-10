package javacore.l037.sumarray;

public class SumArray {
    public static void main(String[] args) {

        int[] array = {0, 35261, 221, 3743, 4, 312, 4, 436457, 846, 846865, 3523, 413, 315, 368, 5698};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("i - " + (i + 1) + "\t|\tsum - " + sum);
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}