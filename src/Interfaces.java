/*

An interface cannot implement another interface. Only classes can do that

Cell Phone          GPS                 Camera                  Media Player
 | extends          | implements           | implements             | implements
 |                  |                      |                        |

                            SmartPhone

SmartPhone is a Cell Phone, and it can be used as a GPS, Camera or Media Player, but it is not one
Implementing an Interface forces method implementation

1. An interface can only have method signatures, constant fields and default methods.
2. The class implementing an interface needs to define the methods and not the fields
3. You can create a reference of Interfaces but not the objects.
4. Interface methods are public by default
 */


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
