package MARCH.DAY3;

import java.lang.String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String Str = "mithin dev";
        System.out.println(lengthOfLastWord(Str));
    }

    static int lengthOfLastWord(String str) {
        int count = 0;
        String[] Sp = str.split(" ");
        int i = str.length() - 1;
        while (str.charAt(i) != ' ') {
            count ++;
            i--;
        }
        return Sp[Sp.length - 1].length();
    }

}
