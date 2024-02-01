public class Methods {
    static void variableArgs(int ...arr) {
        for(int ele: arr) {
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        variableArgs(1, 2, 3, 4);
    }
}
