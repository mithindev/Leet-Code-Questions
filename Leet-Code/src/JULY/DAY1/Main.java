package JULY.DAY1;

public class Main {
    public static void main(String[] args) {
        String temp = "capiTalIze tHe titLe";
        String ans = capitalizeTitle(temp);

        System.out.println(ans);
    }

    static String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder(title.toLowerCase());

        int i = 0; // Point to the start of a word
        int j = 0; // Point to the end of a word

        while (j < sb.length()) {
            while (j < sb.length() && sb.charAt(j) != ' ')
                ++j;
            if (j - i > 2)
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            i = j + 1;
            ++j; // Skip the space
        }

        return sb.toString();
    }
}
