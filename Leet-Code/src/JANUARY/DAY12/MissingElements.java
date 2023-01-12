package JANUARY.DAY12;
import java.util.Arrays;
import java.util.ArrayList;


public class MissingElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int arr1[] = {4, 3, 2, 7, 8, 2, 3, 1};
        Arrays.sort(arr1);
        int len = rmDup(arr1);
        System.out.println(Arrays.toString(arr1));
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr));
        int ans[] = new int[arr1.length - arr.length];
//        System.out.println(ans.length);
        for (int i = 0,j=0; i < arr.length; i++) {
            if (arr[i] == i+1) {
                ;
            } else {
                ans[j] = i+1;
                j++;
            }

        }
        System.out.println(Arrays.toString(ans));
    }

    static int rmDup (int arr[]) {
        if (arr.length <=1) {
            return arr.length;
        }
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                temp[j++] = arr[i-1];
            }
        }
        temp[j++] = arr[arr.length-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}
