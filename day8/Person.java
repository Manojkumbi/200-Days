class Person {
    String name;
    int age;
    String city;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Unknown";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Unknown";
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        // default constructor
        Person person1 = new Person();
        person1.display();

        // two parameters
        Person person2 = new Person("Alice", 25);
        person2.display();

        //three parameters
        Person person3 = new Person("Bob", 30, "New York");
        person3.display();
    }
}
