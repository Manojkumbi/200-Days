package days200;

abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void description() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    //implementation for the abstract method
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class test {
    public static void main(String[] args) {
    	
        Circle circle = new Circle();
        circle.draw();
        circle.description(); 
     }
}
