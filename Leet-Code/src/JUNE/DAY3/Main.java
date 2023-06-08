package JUNE.DAY3;

public class Main {
    public static void main(String[] args) {

    }

    public boolean checkStraightLine(int[][] c) {
        if (c.length == 2) {
            return true;
        }

        int dx = c[1][0] - c[0][0];
        int dy = c[1][1] - c[0][1];

        for (int i = 0; i < c.length; i++) {
            if ((c[i][1] - c[0][1]) * dx != (c[i][0] - c[0][0]) * dy) {
                return false;
            }
        }
        return true;
    }
}
