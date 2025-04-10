package javacore.l029.nestedcycles;

public class NestedCycles {
    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(j * 10 + i + "\t");
            }
            System.out.println("\tJ- " + j);
        }
    }
}