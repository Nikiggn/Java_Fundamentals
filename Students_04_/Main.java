package Students_04_;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String info = scanner.nextLine();

            String firstName = info.split(" ")[0];
            String lastName = info.split(" ")[1];
            double grade = Double.parseDouble(info.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);

        }

        // sort по оценка

        Collections.sort(students, Comparator.comparingDouble(Student::getGrade)
                .reversed());
        for (Student student: students) {
            System.out.printf(student.getFirstName() + " " + student.getLastName() + ": " + "%.2f%n", student.getGrade());
        }
    }
}
