package AUGUST.DAY25;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    static boolean isAcronym(List<String> words, String s) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i) {
                return false;
            }
        }

        return true;
    }
}
