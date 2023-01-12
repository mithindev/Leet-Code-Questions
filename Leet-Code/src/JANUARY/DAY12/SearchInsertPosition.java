package JANUARY.DAY12;
import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int target = 2;

        if (BinarySearch(arr,target) == -1) {
            int ans[] = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                ans[i] = arr[i];
            }
            ans[arr.length] = target;
            Arrays.sort(ans);
            int temp = BinarySearch(ans,target);
            System.out.println(temp);
        } else {
            int temp = BinarySearch(arr,target);
            System.out.println(temp);
        }

    }
    static int BinarySearch (int arr[], int target) {
        int s = 0;
        int e = arr.length -1;

        while (s <= e) {
            int mid = s + (e - s)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        }
        return -1;
    }
}
