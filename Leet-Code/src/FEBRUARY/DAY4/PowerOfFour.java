package FEBRUARY.DAY4;

public class PowerOfFour {
    public static void main(String[] args) {

    }
    static boolean isPowerOfFour(int num){
        if (num == 1) {
            return true;
        }
        if (num <=0) {
            return false;
        }

        if (num > 1) {
            if (num%4 == 0 && isPowerOfFour(num/4)) {
                return true;
            }
        }

        return false;
    }
}
