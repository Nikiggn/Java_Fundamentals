package _9_ExerciseDataTypesandVariables;
import java.util.Scanner;
public class _5_PrintPartoftheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b ; i++) {
            System.out.print((char) i + " ");
        }
    }
}
