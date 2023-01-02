package JANUARY.DAY2;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 3, 5};
        int[] arr = Arrays.copyOfRange(nums,0,nums.length);
        int j = RmDup(arr);
        int[] arr2 = new int[j];
        for (int i = 0; i < j; i++) {
            arr2[i] = arr[i];
        }
        sort(arr2);
        System.out.println(Arrays.toString(arr2));
        if (j == 2) {
//            return arr2[arr2.length -1];
            System.out.println(arr2[arr2.length -1]);
        } else {
            for ( int i = j-3;i >= 0; i--) {
                if (count(nums, arr2[i]) == 1) {
//                    return arr2[i];
                    System.out.println(arr2[i]);
                }
            }
        }

    }
    static int RmDup(int[] arr){
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                temp[j] = arr[i];
                j++;
            }
        }
//        temp[j++] = arr[arr.length-1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
    static int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    static void sort(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
//                    swap(arr[j-1], arr[j]);
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
