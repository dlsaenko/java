package javacore.l053.functionarguments;

public class FunctionArguments {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        funcAdd(a, b);
        funcSub(a, b);
        funcMulti(a, b);
        funcDiv(a, b);
    }

    private static void funcAdd(int a, int b) {
        System.out.println(a + b);
    }

    private static void funcSub(int a, int b) {
        System.out.println(a - b);
    }

    private static void funcMulti(int a, int b) {
        System.out.println(a * b);
    }

    private static void funcDiv(int a, int b) {
        System.out.println(a / b);
    }
}