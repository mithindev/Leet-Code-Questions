package JUNE.DAY5;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String str = "abBAcC";
        String ans = makeGood(str);

        System.out.println(ans);
    }

    static String makeGood(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;

        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if (!list.isEmpty()) {
                if (Math.abs(list.getLast() - arr[i]) == 32) {
                    list.removeLast();
                    continue;
                }
            }

            if (i != len - 1 && Math.abs(arr[i] - arr[i + 1]) != 32) {
                list.add(arr[i]);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!list.isEmpty()) {
            ans.append(list.removeFirst());
        }
        
        return ans.toString();
    }
}
