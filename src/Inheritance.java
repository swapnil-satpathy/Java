// Java does not support multiple inheritance i.e two classes cannot be a super class for a subclass.

class Base {
    public Base() {
        System.out.println("This is a constructor");
    }
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.setX(10);
        derived.setY(20);
        System.out.println(derived.getX());
        System.out.println(derived.getY());
    }
}
