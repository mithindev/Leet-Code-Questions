package FEBRUARY.DAY21;



public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseStr(str, 2));

    }

    static String reverseStr(String str, int k) {
        String ans = "";

        for (int i = 0; i < str.length()-1; i = i+2*k) {
            ans += str.charAt(i+1);
            ans += str.charAt(i);
            for (int j = i+2; j < i+2*k; j++) {
                ans += str.charAt(j);
            }
        }
        return ans;
    }
}
