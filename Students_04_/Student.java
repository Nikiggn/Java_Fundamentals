package Students_04_;

public class Student {
    private String firstName;
    private String lastName;

    private double grade;

    public Student (String firstName, String lastName, double grade){

        this.firstName= firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGrade() {
        return grade;
    }
}
