package MARCH.DAY13;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int r = in.nextInt();

        float area = 3.14f * r *r;

        System.out.println(area);
    }
}
