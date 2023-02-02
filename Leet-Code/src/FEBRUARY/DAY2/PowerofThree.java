package FEBRUARY.DAY2;

public class PowerofThree {
    public static void main(String[] args) {
        boolean ans = isPowerOfThree(27);
        System.out.println(ans);
    }
    static boolean isPowerOfThree(int num) {
        if (num == 1) {
            return true;
        }
        if (num <= 0) {
            return false;
        }

        else if (num > 1) {
            return num%3 == 0 && isPowerOfThree(num/3);
        }


        return false;

    }
}
