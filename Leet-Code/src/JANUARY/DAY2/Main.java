package JANUARY.DAY2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Qn = {2, 2, 2, 3, 1};
        int[] arr = Arrays.copyOfRange(Qn,0,Qn.length);
        System.out.println(Arrays.toString(Qn));
        int ans = RemoveDup(Qn);
        int[] arr1 = Arrays.copyOfRange(arr,0,ans) ;
        System.out.println(Arrays.toString(arr1));
        sort(arr1);
//        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr1.length; i++) {
//            if (count(Qn, ))
//        }



    }
    static int RemoveDup (int[] arr) {
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
        temp[j++] = arr[arr.length-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
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
    static int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
