package JUNE.DAY22;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1};
        System.out.println(pivot(arr));
    }

//    public int findMin(int[] arr) {
//        int s = pivot(arr);
//
//        return arr[s];
//    }

    static int pivot (int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s < e) {
            int mid = s + (e - s)/2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[s] >= arr[mid]) {
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

}
