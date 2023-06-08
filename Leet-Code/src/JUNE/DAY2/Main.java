package JUNE.DAY2;

public class Main {
    public static void main(String[] args) {

    }

    public boolean checkStraightLine(int[][] c) {
        if (c.length == 2) {
            return true;
        }

        for (int i = 1; i < c.length; i++) {
            if (c[i][0] - c[i - 1][0] == 0) {
                return true;
            }
        }

        int x = c[1][0] - c[0][0];
        int y = c[1][1] - c[0][1];
        int m = y/x;
        int cons = c[1][1] - m * c[1][0];

        for (int i = 0; i < c.length; i++) {
            if (!(c[i][1] - m * c[i][0] == cons)) {
                return false;
            }
        }
        return true;
    }
}
