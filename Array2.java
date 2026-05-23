class Student {
  string name;
  int age;

  Student(string name, int age){
    this.age = age;
    this.name = name;
  }

void display(){
  System.out.println(name);
  System.out.println(age);
}
}

public class Array2 {
  public static void main(string[] args){
    // arrays of objects
    Student[] students = new Student[3]; // student class ke 3 objects banenge students array me and object ka size 4 byte hota hai (reference variable) to total size 3*4 = 12 byte hoga students array ka
    //student[] arr = new student[3]; ek aur tarika hai array banane ka
    System.out.println(students[0]); // null print hoga kyuki abhi tak humne student object create nahi kiya hai
    Student s1 = new Student("Aakash", 20);
    Student s2 = new Student("rohit", 21);
    Student s3 = new Student("aman", 22);
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    System.out.println(students[0].name); // Aakash
    System.out.println(students[1].name); // rohit
    System.out.println(students[2].name); // aman

    
    students  [0] = s1;
    students [1] = s2;
    students [2] = s3;

    students[0].display();
    students[1].display();
    students[2].display();

    for(int i=0; i<students.length; i++){
      students[i].display();
    }

    //2nd method to print 
    for(Student s : students){
      s.display();
    }


  }
}
