package JANUARY.DAY26;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {

    }

    static ArrayList<String> perms (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i); // i is not included
            String s = p.substring(i, p.length());
            ans.addAll(perms(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
