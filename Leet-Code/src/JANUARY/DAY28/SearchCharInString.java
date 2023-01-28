package JANUARY.DAY28;

public class SearchCharInString {
    public static void main(String[] args) {
        String name = "mithin";
        System.out.println(search(name, 'm'));

    }

    static int search (String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return 1;
            }
        }
        return 0;
    }
}
