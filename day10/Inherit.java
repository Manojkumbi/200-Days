class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Inherit {

	public static void main(String[] args) {
		Dog b=new Dog();
		b.bark();
		b.eat();
		Animal dog=new Dog(); //super class reference sub class object
		dog.eat();
		

	}

}
