package MARCH.DAY26.INHERITANCE;

class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
}
