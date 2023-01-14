package JANUARY.DAY14;

import java.util.ArrayList;
public class SubSeq {
    public static void main(String[] args) {
        SubSeq("", "abc");
    }
    // a function to print all the subseq of a string;
    static void SubSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubSeq(p + ch,up.substring(1));
        SubSeq(p, up.substring(1));
    }

    static ArrayList<String> SubSeqRet (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = SubSeqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
