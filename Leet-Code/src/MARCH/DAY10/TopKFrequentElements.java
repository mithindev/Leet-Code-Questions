package MARCH.DAY10;

public class TopKFrequentElements {
    public static void main(String[] args) {

    }

    static int[] topKFrequent(int[] arr, int k) {

    }

    static int count (int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
