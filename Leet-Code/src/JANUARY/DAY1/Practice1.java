package JANUARY.DAY1;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    private static void sort(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    swap(arr[j-1], arr[j]);
                }
            }
        }
    }

    private static void swap(int a, int b) {
        int tamp = a;
        a = b;
        b = a;
    }

    static int[] RemoveElement(int[] arr, int index) {
        if (arr.length == 0 || index > arr.length) {
            return arr;
        }
        int[] ans = new int[arr.length-1];

        for (int i = 0,k=0; i < arr.length; i++) {
            if (i == index) {
                ;
            }
            arr[k++] = arr[i];
        }
        return arr;
    }
    private static int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
