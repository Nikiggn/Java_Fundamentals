package _9._DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class _4_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= 5  ; i++) {
            boolean value = true;
            for (int j = 2; j < i ; j++) {
                if (i % j ==0){
                    value = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, value);
        }
    }
}
