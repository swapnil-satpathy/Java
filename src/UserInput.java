import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("We will take input from user");
        /*
        In order to take input from the user, Java has a scanner class
        Scanner class has a lot of methods to read data from the keyboard.
        System.in signifies that we will read from keyboard
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println("The sum of these numbers is : " + sum);
//        // For sentence
        // NextLine is not working
        System.out.println("Enter the sentence");
        String s2 = sc.nextLine();
        System.out.println(s2);
//        System.out.println("Enter the word");
//        // Only for word not for sentence
//        String s = sc.next();
//        System.out.println("The string entered is: " + s);

    }
}
