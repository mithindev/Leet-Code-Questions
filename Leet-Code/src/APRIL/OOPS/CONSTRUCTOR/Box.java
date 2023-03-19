package APRIL.OOPS.CONSTRUCTOR;

public class Box {
    int l;
    int b;
    int h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public Box(int l) {
        this.l = l;
    }

    public Box() {
        System.out.println("You are calling the no arguement constructor");
    }


}
