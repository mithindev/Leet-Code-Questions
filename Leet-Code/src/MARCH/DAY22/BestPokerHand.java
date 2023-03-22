package MARCH.DAY22;

public class BestPokerHand {
    public static void main(String[] args) {
        int[] ranks = {10,10,2,12,9};
        char[] suits = {'a', 'b', 'c', 'a', 'd'};
        System.out.println(bestHand(ranks, suits));
    }

    static String bestHand(int[] ranks, char[] suits) {

        if (countStr(suits, suits[0]) == 5) {
            return "Flush";
        }

        for (int num : ranks) {
            if (countInt(ranks, num) >= 3) {
                return "Three of a Kind";
            }
        }

        for (int num : ranks) {
            if (countInt(ranks, num) >= 2) {
                return "Pair";
            }
        }

        return "High Card";
    }

    static int countInt (int[] arr, int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target) count++;
        }
        return count;
    }

    static int countStr (char[] str, char target) {
        int count = 0;
        for (char i :str) {
            if (i == target) count++;
        }
        return count;
    }

}
