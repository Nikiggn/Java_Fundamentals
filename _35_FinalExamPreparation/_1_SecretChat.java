package _35_FinalExamPreparation;

import java.util.Scanner;

public class _1_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        while (true){
            String commands = scanner.nextLine();
            if (commands.equals("Reveal")){
                break;
            }

            String order = commands.split(":\\|:")[0];

            switch (order){
                case "InsertSpace":
                    break;
                case "Reverse":
                    break;
                case "ChangeAll":
            }
        }
    }
}
