import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student<T> {
    private String name;
    private T rollNumber;
    private int age;

    public Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class StudentDriver {
    private List<Student<?>> students;
    private Scanner scanner;

    public StudentDriver() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public <T> void createStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student roll number:");
        T rollNumber = (T) scanner.nextLine();

        System.out.println("Enter student age:");
        int age = Integer.parseInt(scanner.nextLine());

        Student<T> student = new Student<>(name, rollNumber, age);
        students.add(student);
    }

    public void displayStudentsInfo() {
        System.out.println("Students Information:");
        for (Student<?> student : students) {
            student.displayInfo();
        }
    }

    public static void main(String[] args) {
        StudentDriver driver = new StudentDriver();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you want to add?");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Adding Student " + (i + 1));
            driver.createStudent();
        }

        driver.displayStudentsInfo();
    }
}
