package JUNE.DAY22;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(pivot(arr, 7));
    }

    public int findMin(int[] arr) {
        int s = pivot(arr, arr.length);

        return arr[s];
    }

    static int pivot(int[] arr, int len) {
        int s = 0;
        int e = len - 1;

        while (s < e) {
            int mid = s + (e - s)/2;

            if (arr[mid] > arr[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

}
