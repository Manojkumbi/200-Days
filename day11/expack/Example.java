package expack;

interface Animal {
    void sound(); 
    void sleep();
}
interface mamal{
	void feed();
}

class Dog implements Animal,mamal {
   
    public void sound() {
        System.out.println("Dog barks!");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

	public void feed() {
		System.out.println("feed by mamal....");
		
	}

	
}

public class Example {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  
        dog.sleep();
        dog.feed();
    }
}
