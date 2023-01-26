package JANUARY.DAY26;

import java.util.ArrayList;

public class Perms {
    public static void main(String[] args) {
        ArrayList<String> ans = perms("", "abc");
        System.out.println(ans);

    }

    static ArrayList<String> perms (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int len = p.length();
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= len; i++) {
            if (i == 0) {
                ans.addAll(perms(ch+p, up.substring(1)));
            } else if (i == len) {
                ans.addAll(perms(p+ch, up.substring(1)));
            } else {
                String f = p.substring(0,i);
                String s = p.substring(i,p.length());
                ans.addAll(perms(f + ch + s, up.substring(1)));
            }
        }
        return ans;

    }
}
