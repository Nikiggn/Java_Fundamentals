package _6_BasicExercise;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() -1; i >= 0 ; i--) {

            char symbols = username.charAt(i);
            password += symbols;
        }


    }
}
