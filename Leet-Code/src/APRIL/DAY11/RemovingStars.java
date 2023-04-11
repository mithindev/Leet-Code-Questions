package APRIL.DAY11;

public class RemovingStars {
    public static void main(String[] args) {
        String ans = removeStars("*leet**cod*e");
        System.out.println(ans);
    }

    static String removeStars(String s) {
        StringBuilder temp = new StringBuilder();



        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                temp.append(ch);
            } else {
                temp.deleteCharAt(temp.length() - 1);
            }
        }
        return temp.toString();
    }
}
