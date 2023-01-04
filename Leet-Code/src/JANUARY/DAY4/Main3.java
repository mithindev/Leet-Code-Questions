package JANUARY.DAY4;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, -1, 0, 0};
//        sort(arr1);
        int[] arr2 = {-1, 0, 0, 0, 0, 0, 1};
//        sort(arr2);
        int[] ans = merge(arr1, arr2);
        sort(ans);
        System.out.println(Arrays.toString(ans));
        int mid = ans.length/2;
        System.out.println(mid);
        double avg = (ans[mid-1] + ans[mid])/2;
        System.out.println(avg);


    }
    static void sort(int[] arr) {
        if (arr.length < 2 ) {
            return;
        }
        for (int i = 0;i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length+arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            ans[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            ans[k] = arr2[i];
            k++;
        }
        return ans;
    }
    
}
