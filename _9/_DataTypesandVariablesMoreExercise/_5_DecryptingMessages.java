package _9._DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class _5_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines ; i++) {
            char symbol =scanner.nextLine().charAt(0);
            int newSymbol = symbol + key;
            char newChar = (char) newSymbol;
            System.out.print(newChar);
        }
    }
}
