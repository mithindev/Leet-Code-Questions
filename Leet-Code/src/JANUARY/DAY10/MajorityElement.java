package JANUARY.DAY10;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        for (int i = 0; i < arr.length; i++) {
            if (count(arr, arr[i]) > arr.length/2) {
                System.out.println(arr[i]);
                break;
            }
        }

    }

    static int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
