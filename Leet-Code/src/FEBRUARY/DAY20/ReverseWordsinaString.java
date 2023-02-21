package FEBRUARY.DAY20;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }
    static String reverseWords(String str) {
        String ans = "";
        String[] temp = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (i <= temp.length-2) {
                String t = rev(temp[i]);
                ans += t;
                ans += " ";
            } else{
                String t = rev(temp[i]);
                ans += t;
            }
        }
        return ans;
    }

    static String rev (String str) {
        String ans = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }
        return ans;
    }

}
