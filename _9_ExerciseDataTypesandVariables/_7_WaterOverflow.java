package _9_ExerciseDataTypesandVariables;

import java.util.Scanner;

public class _7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int filledCapacity = 0;

        int nLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nLines; i++) {
            int litersToPour = Integer.parseInt(scanner.nextLine());

            if (litersToPour > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= litersToPour;
            }
        }
        System.out.println(255 - capacity);
    }
}
