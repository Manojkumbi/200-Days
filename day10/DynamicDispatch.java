class A {
    void display() {
        System.out.println("Display method in class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Display method in class B");
    }
}

class C extends A {
    void display() {
        System.out.println("Display method in class C");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        A obj; 

        obj = new B(); 
        obj.display();
        
        obj = new C(); 
        obj.display(); 
        
    }
}
