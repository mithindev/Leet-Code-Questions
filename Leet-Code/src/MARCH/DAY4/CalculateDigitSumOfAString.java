package MARCH.DAY4;

import java.util.List;
import java.util.ArrayList;

public class CalculateDigitSumOfAString {
    public static void main(String[] args) {

    }

    static String digitSum(String str, int k) {
        
    }

    static List<String> usingSubstringMethod(String text, int n) {
        List<String> results = new ArrayList<>();
        int length = text.length();

        for (int i = 0; i < length; i += n) {
            results.add(text.substring(i, Math.min(length, i + n)));
        }

        return results;
    }
}
