package FEBRUARY.DAY7;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println();
        System.out.println(WithoutRepeatingCharacters(str));
    }

    static int WithoutRepeatingCharacters(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (!isPresent(ans, str.charAt(i))) {
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
        return ans.length();
    }

    static boolean isPresent(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
