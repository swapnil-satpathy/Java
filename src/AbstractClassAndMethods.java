// Abstract Method is a method that is declared without any implementation
// If a class includes abstract methods, then the class itself should be declared abstract
abstract class Parent {
    public Parent() {
        System.out.println("I am a constructor of Base1");
    }
    public void sayHello() {
        System.out.println("Hello World");
    }
    abstract public void greet();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

/*
Class 'Child2' must either be declared abstract or implement abstract method 'greet()' in 'Parent'
 */
abstract class Child2 extends Parent {
    public void th() {
        System.out.println("I am good");
    }
}
public class AbstractClassAndMethods {
    public static void main(String[] args) {
//        'Child2' is abstract; cannot be instantiated
//        So below is not possible
//        Child2 child = new Child2();
        Child child = new Child();
        child.greet();
    }
}
