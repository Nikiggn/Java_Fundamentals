package _8_LabDataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.valueOf(0);


        for (int i = 1; i <= n ; i++) {
            BigDecimal numbers = new BigDecimal(scanner.nextLine());
             sum  = sum.add(numbers);
        }
        System.out.println(sum);
    }
}
