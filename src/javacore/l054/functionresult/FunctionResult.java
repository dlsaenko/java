package javacore.l054.functionresult;

public class FunctionResult {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int result;

        result = funcAdd(a, b);
        System.out.println(result);
    }

    private static int funcAdd(int a, int b) {
        return a + b;
    }
}