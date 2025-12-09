class Animal {
    String name = "Animal";

    public void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    public void display() {
        super.display(); // Calls the method from the superclass
        System.out.println("This is a dog.");
    }

    public void printNames() {
        System.out.println("Superclass name: " + super.name); // Accesses superclass variable
        System.out.println("Subclass name: " + name);
    }
}

public class superkey {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        dog.printNames();
    }
}
