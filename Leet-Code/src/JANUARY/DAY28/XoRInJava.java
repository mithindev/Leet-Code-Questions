package JANUARY.DAY28;

public class XoRInJava {
    public static void main(String[] args) {
        String stringA = "abcd";
        String stringB = "abcde";
        int j = 0;
        char xoredChar = (char) (stringA.charAt(j) ^ stringB.charAt(j));
        System.out.printf("'%c' = %d\n", xoredChar, (int) xoredChar);
    }
}
