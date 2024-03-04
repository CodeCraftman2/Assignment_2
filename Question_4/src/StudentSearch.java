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
    public static Student linearSearch(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.getRn() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}
public class StudentSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = {
                new Student("Yagya", 101, 85),
                new Student("Deepesh", 102, 90),
                new Student("Ankit", 103, 78),
                new Student("Aman", 104, 95)
        };
        System.out.print("Enter the roll number to search: ");
        int rollNumberToSearch = Integer.parseInt(sc.nextLine());
        Student foundStudent = Student.linearSearch(students, rollNumberToSearch);
        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
        sc.close();
    }
}
