package MARCH.DAY15;
/*
258. Add Digits
Author: Mithin Dev
Date: 15-03-2023
 */

public class AddDigits {
    public static void main(String[] args) {

    }

    static int addDigits(int num) {
        if(num == 0) {
            return 0;
        }
        if(num % 9 == 0) {
            return 9;
        }

        return num % 9;
    }
}
