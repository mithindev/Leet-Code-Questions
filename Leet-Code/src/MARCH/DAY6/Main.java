package MARCH.DAY6;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(findKthPositive(arr, 2));
//        System.out.println(BinarySearch(arr, 1));

    }

    static int findKthPositive(int[] arr, int k) {
        int temp = 1;
        int ans = 0;

        while (k > 0) {
            if (!BinarySearch(arr, temp)) {
                k--;
                ans = temp;
            }
            temp++;
        }
        return ans;
    }

    static boolean BinarySearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s)/2;

            if (arr[mid] == target) {
                return true;
            }

            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return false;
    }
}
