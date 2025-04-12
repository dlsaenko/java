package javacore.l052.functionsandmethods;

public class FunctionsAndMethods {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int sum = getSum(array);
        System.out.println(sum);
    }

    //Extract method
    private static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}