package _28_LabTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr  = scanner.nextLine().split(" ");
        List<String> result = new ArrayList<>();

        for (String word : strArr) {
            for (int i = 0; i < word.length() ; i++) {
                result.add(word);
            }
        }
        System.out.print(String.join("", result));
    }
}
