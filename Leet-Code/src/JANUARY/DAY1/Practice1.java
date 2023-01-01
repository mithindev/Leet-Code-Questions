package JANUARY.DAY1;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        boolean dup = false;
        int[] ans = RmDuplicates(arr);
        sort(ans);
        System.out.println(Arrays.toString(ans));

        System.out.println(ans.length);

        if (ans.length == 2 || ans.length == 1) {
            System.out.println(ans[ans.length-1]);

        } else {
            System.out.println(ans[ans.length-3]);

        }

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

    static int[] RmDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count(arr, arr[i]) == 1) {
                count++;
            }
        }
        int[] arr2 = new int[count];

        for (int i = 0,k=0; i < arr.length; i++) {
            if (count(arr, arr[i]) == 1) {
                arr2[k] = arr[i];
                k++;
            }
        }
        return arr2;
    }



//    static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }

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
    static int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    static int unique(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count(arr, arr[i]) == 1) {
                count++;
            }
        }
        return count;
    }
}
