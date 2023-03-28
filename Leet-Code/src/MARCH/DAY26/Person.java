package MARCH.DAY26;

public class Person {
    String name;

    // Now this is a constructor;

    Person (String n) {
        name = n;
    }

    public static void main(String[] args) {
        Person p1 = new Person ("Mithin");
        System.out.println(p1.name);
    }
}
