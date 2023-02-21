package FEBRUARY.DAY21;



public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseStr(str, 2));

    }

    static String reverseStr(String str, int k) {
        String ans = "";

//        for (int i = 0; i < str.length(); i = i+2*k) {
//            ans += str.charAt(i+1);
//            ans += str.charAt(i);
//            for (int j = i+2; j < i+2*k; j++) {
//                ans += str.charAt(j);
//            }
//        }

        int i = 0;
        while (i < str.length()) {
            ans += str.charAt(i+1);
            ans += str.charAt(i);
            for (int j = i+2; j < i+2*k; j++) {
                ans += str.charAt(j);
            }
            if (i < str.length()-2*k) {
                i = i+2*k;
            } else {
                return ans;
            }

        }
        return ans;
    }
}
