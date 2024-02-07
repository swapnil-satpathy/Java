interface Camera {
    void takePicture();
    void recordVideo();
    default void record4kVideo() {
        System.out.println("Taking 4k Video");
    }
}

interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone {
    void callNumber(int number) {
        System.out.println("Calling number, " + number);
    }
}

class SmartPhones extends CellPhone implements Camera, Wifi {
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
public class DefaultMethods {
    public static void main(String[] args) {
        SmartPhones smartPhone = new SmartPhones();
        smartPhone.connectToNetwork("Swapnil");
        String[] networks = smartPhone.getNetworks();
        for(String network: networks) {
            System.out.println(network);
        }
    }
}
