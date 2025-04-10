package javacore.l028.operatorcontinue;

public class OperatorContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 20 ; i++) {
            if (i <= 10 || i >= 15) {
                System.out.print(i + " ");
            }
        }
    }
}