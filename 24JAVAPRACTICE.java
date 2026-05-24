abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void displayRole();
}

class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {

        Person s = new Student("Aakash", 20, "Computer Science");
        Person t = new Teacher("Sharma Sir", 40, "Java");

        s.displayRole();
        ((Student) s).displayDetails();

        System.out.println();

        t.displayRole();
        ((Teacher) t).displayDetails();
    }
}