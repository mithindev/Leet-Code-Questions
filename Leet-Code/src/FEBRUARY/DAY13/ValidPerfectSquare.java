package FEBRUARY.DAY13;


public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(Sqrt(16));
    }

    static boolean isPerfectSquare(int num) {
        if (Sqrt(num)%1 == 0) {
            return true;
        } else {
            return false;
        }

    }

    static double Sqrt (double n) {
        double x = n;
        double root;

        while (true) {
            root = (0.5) * (x + (n/x));

            if (Math.abs(root - x) < 0.000005) {
                break;
            }

            x = root;
        }
        return root;
    }
}
