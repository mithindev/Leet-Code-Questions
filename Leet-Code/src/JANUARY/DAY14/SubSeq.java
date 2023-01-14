package JANUARY.DAY14;

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
}
