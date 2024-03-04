import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;
    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }
    public int getRn() {
        return rn;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.rn, other.rn); // Compare based on roll number
    }
    public String toString() {
        return "Student [Name: " + name + ", Roll Number: " + rn + ", Total Marks: " + totalMark + "]";
    }
}
public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yagya", 101, 85));
        students.add(new Student("Deepesh", 102, 90));
        students.add(new Student("Ankit", 103, 78));
        students.add(new Student("Aman", 104, 95));

        Collections.sort(students);//sort method

        System.out.println("Sorted list of student objects:");
        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}
