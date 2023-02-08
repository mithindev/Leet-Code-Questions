package FEBRUARY.DAY8;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(Arrays.toString(str));
    }

    static void reverseString(char[] str) {
        for (int i = 0; i < str.length/2; i++) {
            char temp = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = temp;
        }
    }
}
