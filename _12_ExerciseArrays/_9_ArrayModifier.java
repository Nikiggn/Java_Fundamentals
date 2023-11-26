package _12_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values  = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();


    }
}
