class Student {
    // Instance variables
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name; 
        this.age = age;   
    }

    // display the student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("John", 20);

        
        student1.display();
    }
}
