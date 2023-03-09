package FEBRUARY.DAY27;

public class Main {
    static void StaticMethod () {
        System.out.println("Static Method");
    }
    // It is to be noted that a static methods can be called without creating objects

    void NonStaticMethod () {
        System.out.println("Non Static Method");
    }

    public static void main(String[] args) {
        StaticMethod(); // No Error
        //NonStaticMethod(); // This Gives a error

        Main object = new Main(); // Creating Object
        object.NonStaticMethod(); // Calling Method On Object

    }
}
