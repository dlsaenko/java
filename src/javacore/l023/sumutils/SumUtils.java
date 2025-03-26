package javacore.l023.sumutils;

public class SumUtils {
    public static void main(String[] args) {

        int min = 1;  //Для цикла for
        int max = 100;
        int sum = 0;
        int i;        //Для цикла while

        for (i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до 100 - " + sum);

        while (i <= max) {
            sum += 1;
        }
        System.out.println("Сумма чисел от 1 до 100 - " + sum);
    }
}