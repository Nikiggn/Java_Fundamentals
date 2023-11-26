package OpinionPoll_03_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = Integer.parseInt(scanner.nextLine());

        // списък с обекти от класа Person
        List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String personalData = scanner.nextLine();
            String[] data = personalData.split(" ");

            String name = data[0];
            int age  = Integer.parseInt(data[1]);

            if (age > 30){
                Person person = new Person(name, age);// обект от класа
                peopleList.add(person);

            }
        }

        // списъка с хората над 30
         //всеки човек - отпечатваме

        for (Person person: peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
