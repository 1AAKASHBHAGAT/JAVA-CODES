// Student class (OOP concept)
class Student {
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    // Method to check pass/fail
    public void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " is PASS");
        } else {
            System.out.println(name + " is FAIL");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Array of objects
        Student[] students = new Student[3];

        // Creating objects
        students[0] = new Student(1, "Aakash", 85);
        students[1] = new Student(2, "Rahul", 35);
        students[2] = new Student(3, "Priya", 72);

        // Loop through array
        for (int i = 0; i < students.length; i++) {
            students[i].display();
            students[i].checkResult();
        }
    }
}