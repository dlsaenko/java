package javacore.l056.functioncall;

public class FunctionCall {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result;
        result = funcAdd(a, b); //Вызов функции
    }

    private static int funcAdd(int a, int b) { //Объявление функции
        return a + b;
    }

    private static int funcSub(int a, int b) { //Объявление функции
        return a - b;
    }
}