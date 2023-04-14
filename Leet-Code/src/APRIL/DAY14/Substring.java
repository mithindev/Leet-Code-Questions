package APRIL.DAY14;

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

//    static int longestPalindromeSubseq(String s) {
//        int len = s.length() - 1;
//        return helper(s.toCharArray(), 0, len);
//    }
//
//    static int helper(char[] str, int s, int e) {
////        int l = str.length - 1;
//
//        if (s == e) {
//            return 1;
//        }
//
//        if (s+1 == e) {
//            if (str[s] == str[e]) {
//                return 2;
//            } else {
//                return 1;
//            }
//        }
//
//        if (str[s] == str[e]) {
//            return helper(str, s + 1, e - 1) +2;
//        }
//
//        return max(helper(str, s + 1, e), helper(str, s, e - 1));
//    }
//
//    static int max (int num1, int num2) {
//        return (num1 > num2) ? num1:num2;
//    }

    static int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int len = s.length();
        
        String revS = new StringBuilder(s).reverse().toString();
        
        int [][] matrix = new int[len + 1][len + 1];

        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= len; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (s.charAt(i - 1) == revS.charAt(j - 1)) {
                     matrix[i][j] = matrix[i - 1][j-1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
            return matrix[len][len];
        }
    }


}
