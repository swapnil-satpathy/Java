public class StringMethods {
    public static void main(String[] args) {
        String name = "Swapnil Satpathy";
        name = name.toLowerCase();
        System.out.println(name);
        String text = "Swapnil Satpathy";
        text = text.replace(" ", "_");
        System.out.println(text);

//        Detect double and triple spaces in a string
        String myString = "This string contains  double and triple spaces";
        System.out.println(myString.indexOf("  ") != -1);
        System.out.println(myString.indexOf("   ") != -1);
    }
}
