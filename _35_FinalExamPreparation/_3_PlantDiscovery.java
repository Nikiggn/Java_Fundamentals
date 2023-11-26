package _35_FinalExamPreparation;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class _3_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> info = new LinkedHashMap<>();

        while (true){
            String command = scanner.nextLine();
            if (command.equals("Exhibition")){
                break;
            }

            String plant = command.split("<->")[0];
            int rarity = Integer.parseInt(command.split("<->")[1]);

            switch (command){
                case "Rate":
                    break;
                case "Update":
                    break;
                case "Reset":
                    break;
            }

        }
    }
}
