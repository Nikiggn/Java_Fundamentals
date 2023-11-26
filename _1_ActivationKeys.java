import java.io.BufferedReader;
import java.util.Scanner;

public class _1_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String key = scanner.nextLine();

        while(true){
            String line = scanner.nextLine();
            if (line.equals("Generate")){
                break;
            }

            String instructions = line.split(">>>")[0];

            switch (instructions){
                case "Contains":
                    String substring = line.split(">>>")[1];
                    if (key.contains(substring)){

                    }
                    break;
            }
        }
    }
}
