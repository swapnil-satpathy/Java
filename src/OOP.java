// Every Java file can have only one public class

/*
Access Modifiers
1. public
2. private
3. default
4. protected
*/

class MyEmployee {
    private int id;
    private String name;
    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int _id) {
        id = _id;
    }
}
public class OOP {
    public static void main(String[] args) {
        MyEmployee myEmployee = new MyEmployee(1, "Swapnil");

        System.out.println(myEmployee.getName());
        System.out.println(myEmployee.getId());
    }
}
