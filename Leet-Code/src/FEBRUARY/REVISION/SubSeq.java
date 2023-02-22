package FEBRUARY.REVISION;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq1("", "abcd");
    }

    // FUNCTION - 1]

    static void subSeq1 (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq1(ch + p, up.substring(1));
        subSeq1(p, up.substring(1));
    }

    // FUNCTION - 2]

    static ArrayList<String> subSeqRet (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(ch + p, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}
