package CompanyRosterMORE_1_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Employee> employees = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();

            String name = command.split(" ")[0];
            double salary = Double.parseDouble(command.split(" ")[1]);
            String position = command.split(" ")[2];
            String department = command.split(" ")[3];
            String email = command.split(" ")[4];
            int age = Integer.parseInt(command.split(" ")[5]);

        }
    }
}
