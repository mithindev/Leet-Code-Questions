package MARCH.DAY21;

import java.util.Arrays;

public class ClassSeatingLayout {
    public static void main(String[] args) {
        int col_no = 10;

        int myRow = 3;
        int rollStart = 10 * myRow;

        int[][] MyClass = new int[7][10];



        for (int row = myRow; row < 7; row++) {
            for (int col = 0; col < 10; col++) {
                MyClass[row][col] = 10 * row + col + 1;
            }
        }

        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < 10; col++) {
                MyClass[row][col] = 10 * row + col + 1;
            }
        }

        for (int i = myRow; i < 7; i++) {
            System.out.println(Arrays.toString(MyClass[i]));
        }
        for (int i = 0; i < myRow; i++) {
            System.out.println(Arrays.toString(MyClass[i]));
        }
    }
}
