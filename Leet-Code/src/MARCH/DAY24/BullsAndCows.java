package MARCH.DAY24;

/*
Question: 299. Bulls and Cows
Link: https://leetcode.com/problems/bulls-and-cows/
 */

public class BullsAndCows {
    public static void main(String[] args) {
        String ans = getHint("1123", "0111");
        System.out.println(ans);

    }

    static String getHint(String secret, String guess) {
        String ans = "";
        String temp = secret;
        
        int correct = 0;
        int incorrect = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                correct++;
                temp = pop(temp, i);
            } else if (isPresent (temp, guess.charAt(i))){
                incorrect++;
            }
        }
        ans += Integer.toString(correct);
        ans += "A";
        ans += Integer.toString(incorrect);
        ans += "B";
        return ans;
    }

    static boolean isPresent (String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    static String pop (String str, int index) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != index) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

}
