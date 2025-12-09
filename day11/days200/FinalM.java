package days200;


class Animal {
 final void makeSound() {
     System.out.println("Animal sound.");
 }
}

final class Dog extends Animal {


 void display() {
     System.out.println("Dog class.");
 }
}

//can not inherit from dog class to other class 
//class pitbull extends Dog{
//	
//}

public class FinalM {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.makeSound(); 
     dog.display();  
 }
}
