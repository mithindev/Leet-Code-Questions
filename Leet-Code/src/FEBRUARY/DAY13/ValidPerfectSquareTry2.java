package FEBRUARY.DAY13;

public class ValidPerfectSquareTry2 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));

    }

    static boolean isPerfectSquare(int num) {
        long s = 0;
        long e = num;

        while (s <= e) {
            long mid = s + (e - s)/2;
            long t = mid*mid;

            if (t == num) {
                return true;
            }
            else if (t < num) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }

}
