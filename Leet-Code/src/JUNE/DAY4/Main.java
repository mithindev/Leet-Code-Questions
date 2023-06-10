package JUNE.DAY4;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        System.out.println(nextGreatestLetter(arr, 'a'));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        for (char ch : letters) {
            if (ch > target) {
                return ch;
            }
        }

        return letters[0];

    }

    public double myPow(double x, int y) {
        double ans = 1;
        if (y == 0) {
            return 1;
        }

        if (y < 0) {
            x = 1/x;
            y = -1*(y);
        }

        if (y % 2 == 0) {
            return myPow(x*x, y/2);
        } else {
            return x * myPow(x*x, (y - 1)/2);
        }
    }
}
