package AUGUST.DAY25;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    static int countPairs(List<Integer> arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}