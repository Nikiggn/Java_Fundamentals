package OrderbyAge_06_;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<People> people = new ArrayList<>();


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }

            String name = command.split(" ")[0];
            String id = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            People person = new People(name, id, age);
            people.add(person);
        }
        Collections.sort(people, Comparator.comparingInt(People::getAge));
        for (People person : people) {

            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(), person.getId(), person.getAge());
        }

    }
}
