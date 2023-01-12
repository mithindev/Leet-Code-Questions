package JANUARY.DAY12;

public class BinSearch {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int ans = BS(arr, 0);
        System.out.println(ans);


    }
    static int BS (int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            } else if (target > arr[m]) {
                s = m+1;
            } else {
                e = m-1;
            }
        }
        return -1;
    }


}
