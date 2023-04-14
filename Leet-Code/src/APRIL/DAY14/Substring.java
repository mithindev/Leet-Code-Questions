package APRIL.DAY14;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("cbbd"));
    }

    /* BRUTE FORCE SOLUTION*/
//    static int longestPalindromeSubseq(String s) {
//        int ans = 0;
//
//        ArrayList<String> list = removeDuplicates(SubSeq("", s));
//
//        for(String str : list) {
//            if (isPalindrome(str)) {
//                if (str.length() > ans) {
//                    ans = str.length();
//                }
//            }
//        }
//        return ans;
//    }
//
//    static ArrayList<String> SubSeq (String p, String up) {
//        if (up.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        char ch = up.charAt(0);
//
//        ArrayList<String> left = SubSeq(p + ch, up.substring(1));
//        ArrayList<String> right = SubSeq(p + "", up.substring(1));
//
//        left.addAll(right);
//
//        return left;
//    }
//
//    static boolean isPalindrome (String str) {
//        for (int i = 0; i < str.length()/2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static ArrayList<String> removeDuplicates (ArrayList<String> list) {
//        ArrayList<String> ans = new ArrayList<>();
//
//        for (String i : list) {
//            if (!ans.contains(i)) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }

    
}
