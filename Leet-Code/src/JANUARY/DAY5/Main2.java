package JANUARY.DAY5;
import java.util.Arrays;

// Program to find the ith min and i th max;

public class Main2 {
    public static void main(String[] args) {
//        [-1,10,6,7,-7,1]
        int[] arr = {-1, 10, 6, 7, -7, 1};

        System.out.println(max(arr,2));
        System.out.println(min(arr,2));
        for (int i = 1; i < arr.length/2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == (-1)*max(arr,i));
                System.out.println(max(arr,i));
                break;
            }
//            if (max(arr,i) == (-1)*min(arr,i)) {
//                System.out.println(max(arr,i));
//            }
        }

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

    static int min(int[] arr, int i) {
        sort(arr);
        return arr[i-1];
    }


    static int max(int[] arr, int i) {
        sort(arr);
        return arr[arr.length-i];
    }

}
