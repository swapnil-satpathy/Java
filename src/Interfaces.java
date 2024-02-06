interface Bicycle {
    // You cannot modify the properties in interfaces since they are final
    int a = 50;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

// A class can implement multiple interfaces but can extend one class only
class Cycle implements Bicycle {
    int speed = 20;
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    //    These methods should be public
    public void speedUp(int increment) {
        speed += increment;
    }
    public void printSpeed() {
        System.out.println(speed);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.applyBrake(5);
        cycle.printSpeed();
        cycle.speedUp(2);
        cycle.printSpeed();
    }
}
