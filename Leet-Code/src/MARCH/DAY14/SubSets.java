package MARCH.DAY14;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        List<String> ans = subset("", "abcd");
        String a = "mithin";

        for (String i : ans ) {
            System.out.println(i);
        }
    }

    static List<String> subset (String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        List<String> left = subset(p + ch, up.substring(1));
        List<String> right = subset(p , up.substring(1));

        left.addAll(right);

        return left;
    }
}
