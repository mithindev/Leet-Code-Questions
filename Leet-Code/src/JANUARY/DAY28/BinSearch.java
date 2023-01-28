package JANUARY.DAY28;
import java.util.Arrays;

public class BinSearch {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 5, 6};
//        System.out.println(BinSearch(arr, 5));
        int target = 1;
        int[] arr = {1};
        int[] ans = new int[2];
        ans[0] = BinSearch(arr, target);
        if (BinSearch(arr, target) == -1) {
            ans[1] = -1;
//            return ans;
            System.out.println(Arrays.toString(ans));

        }
        if (arr.length == 1) {
            ans[1] = 0;
            System.out.println(Arrays.toString(ans));
        }
        int count = count(arr, 5)-1;
        ans[1] = ans[0] + count;
        System.out.println(Arrays.toString(ans));



    }

    static int count (int[] arr, int target) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                cnt++;
            }
        }
        return cnt;
    }
    static int BinSearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s)/2;
            if (arr[mid] == target) {
//                return mid;
                while (mid >=1 && (arr[mid - 1] == target)) {
                    mid--;
                }
                return mid;
            }

            if (target > arr[mid]) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        }

        return -1;
    }
}
