package days200;

class MyClass {
    int id;

    MyClass(int id) {
        this.id = id;
    }

    
    public String toString() {
        return "MyClass object with id: " + id;
    }

    
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(101);
        MyClass obj2 = new MyClass(101);

        System.out.println(obj1.toString()); 
        System.out.println(obj2.toString());

        
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

  
        System.out.println("HashCode of obj1: " + obj1.hashCode());
        System.out.println("HashCode of obj2: " + obj2.hashCode());
    }
}
