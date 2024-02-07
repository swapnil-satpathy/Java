interface MyCamera {
    void takePicture();
    void recordVideo();
    default void record4kVideo() {
        System.out.println("Taking 4k Video");
    }
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int number) {
        System.out.println("Calling number, " + number);
    }
}

class MySmartPhones extends MyCellPhone implements MyCamera, MyWifi {
    private String[] networks = new String[3];
    private int index = 0;
    public void takePicture() {
        System.out.println("Takes Picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Records Video");
    }

    @Override
    public void connectToNetwork(String network) {
        if(index == 3) {
            return;
        }
        networks[index] = network;
        index += 1;
    }

    @Override
    public String[] getNetworks() {
        return networks;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // This below is not allowed since the reference is of type Camera.
        // You can only use functions defined in interface Camera
        // It is a smartphone but use it as a Camera
        MyCamera camera = new MySmartPhones();
//        camera.connectToNetwork("Swapnil");
        camera.recordVideo();
        MySmartPhones smartPhone = new MySmartPhones();
        smartPhone.connectToNetwork("Swapnil");
        String[] networks = smartPhone.getNetworks();
        for(String network: networks) {
            System.out.println(network);
        }
    }
}
