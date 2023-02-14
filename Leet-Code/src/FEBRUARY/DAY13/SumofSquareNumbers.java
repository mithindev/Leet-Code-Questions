package FEBRUARY.DAY13;

import java.lang.Math;

public class SumofSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));

    }

    static boolean judgeSquareSum(int num) {
        for (int i = 1; i < num; i++) {
            if (Math.pow(i, 2) + Math.pow(num-i, 2) == num) {
                return true;
            }
        }
        return false;
    }

}
