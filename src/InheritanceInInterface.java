interface Interface1 {
    void meth1();
    void meth2();
}

interface Interface2 extends Interface1 {
    void meth3();
    void meth4();
}

class Sample implements Interface2 {
    @Override
    public void meth3() {
        System.out.println("Method 3");
    }
    @Override
    public void meth4() {
        System.out.println("Method 4");
    }
    @Override
    public void meth1() {
        System.out.println("Method 1");
    }
    @Override
    public void meth2() {
        System.out.println("Method 2");
    }
}

public class InheritanceInInterface {
    public static void main(String[] args) {

    }
}
