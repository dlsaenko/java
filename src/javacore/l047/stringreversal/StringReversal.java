package javacore.l047.stringreversal;

public class StringReversal {
    public static void main(String[] args) {

        String myString = "0123456789";
        String reversed = "";

        for (int i = myString.length() - 1; i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }
        System.out.println("");
        System.out.println("----------------------");
        System.out.println(myString);

        for (int i = myString.length() - 1; i >= 0; i--) {
            reversed += myString.charAt(i);
        }
        System.out.println(myString);
    }
}