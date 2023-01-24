package JANUARY.DAY24;

import java.util.Objects;

public class StringDiff {
    public static void main(String[] args) {
        String str = "mithin";
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        int ans = StrSearch("mtihin", "m");
        System.out.println(ans);
    }

    static int StrSearch (String str, String target) {
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (Objects.equals(ch1, target)) {
                return 1;
            }
        }
        return 0;
    }
}
