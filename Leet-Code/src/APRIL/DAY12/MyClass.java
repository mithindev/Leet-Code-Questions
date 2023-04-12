package APRIL.DAY12;

public class MyClass {
    private int x;
    public MyClass() {
        this(5);
    }

    public MyClass(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.x);
    }
}
