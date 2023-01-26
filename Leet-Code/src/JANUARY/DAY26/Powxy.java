package JANUARY.DAY26;

public class Powxy {
    public static void main(String[] args) {

    }

    static double power(double x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y < 0) {
            y = -1*y;
            x = 1/x;
            return x*power(x, y-1);
        } else {
            return x*power(x, y-1);
        }
    }

    static double pow(double x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y < 0) {
            y = y*-1;
            x = 1/x;
            if (y == Integer.MIN_VALUE) {
                y--;
                return pow (x*x, y/2);
            }
        }
        if (y%2 == 0) {
            return pow (x*x, y/2);
        } else {
            return x*pow (x*x, (y-1)/2);
        }
    }
}
