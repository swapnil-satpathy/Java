
class A {
    public int a;
    public int firstFunction() {
        return 4;
    }

    public void secondFunction() {
        System.out.println("I am a method of class A");
    }
}

class B extends A {
    public void thirdFunction() {
        System.out.println("I am a method of class B");
    }

//    Below is an example of method overriding
    @Override
    public void secondFunction() {
        System.out.println("I am a method of class B");
    }
}

class Phone {
    public void name() {
        System.out.println("Phone's name");
    }
}

class SmartPhone extends Phone {
    public void name() {
        System.out.println("SmartPhone's name");
    }
    public void ring() {
        System.out.println("This method is only in smart phone class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.secondFunction();

        // All SmartPhones are phones
        Phone phone = new SmartPhone();
        phone.name();
//        This is not allowed
//        phone.ring();
    }
}
