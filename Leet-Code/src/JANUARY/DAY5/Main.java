package JANUARY.DAY5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, -5, -4, -3, -2, -1};

//        System.out.println(min(arr));
//        System.out.println(max(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1, j=0;i>=0; i--) {
            if (arr[i] == (-1)*arr[j]) {
                System.out.println(arr[i]);
                break;
            }
            j++;

        }

    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


//    static int removeDup (int[] arr) {
//        if (arr.length == 0 || arr.length == 1) {
//            return arr.length;
//        }
//        int[] temp = new int[arr.length];
//        int j = 0;
//        for (int i =0;i < arr.length;i++) {
//            if (arr[i] != arr[i+1]){
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        temp[j++] = arr[arr.length-1];
//        for (int i = 0; i < j; i++) {
//            arr[i] = temp[i];
//        }
//        return j;
//    }



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



}
