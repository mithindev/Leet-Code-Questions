package MARCH.DAY11;

import java.util.Arrays;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "  hello    mithin   dev  world    ";
        System.out.println(reverseWords(s));
//        String[] str = s.split(" ");
//        System.out.println(Arrays.toString(str));
//        System.out.println(str[str.length - 1]);
//        String an = "";
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[str.length - i - 1] != "") {
//                an += str[str.length - i - 1] + " ";
//            }
//        }
//        System.out.println(an);
    }

    static String reverseWords(String str) {

        if (str == null || str.length() == 0) {
            return "";
        }
        String an = "";
        String[] ans = str.split(" ");

        for (int i = 0; i < ans.length; i++) {
            if (ans[ans.length - i - 1] != "") {
                an += ans[ans.length - i - 1] + " ";
            }
        }
        return an.trim();
    }
}
