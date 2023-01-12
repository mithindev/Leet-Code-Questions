package JANUARY.DAY12;

public class Test {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int ans = BinarySearch(arr, 7);
        System.out.println(ans);

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
