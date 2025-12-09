

// MultilevelInheritance.java
class Animal {
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep(); // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Defined in Dog
    }
}
