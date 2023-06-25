package JUNE.DAY6;

public class Main {
    public static void main(String[] args) {
        String str = "0P";

        System.out.println(Character.isLetter('0'));
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder temp = new StringBuilder(str);
        temp.reverse();

        return str.toString().equals(temp.toString());
    }

}
