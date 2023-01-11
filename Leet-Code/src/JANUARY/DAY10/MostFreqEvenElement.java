package JANUARY.DAY10;

public class MostFreqEvenElement {
    public static void main(String[] args) {
        int count = 0;
        int element = 0;
        int[] arr = {0, 1, 2, 2, 4, 4, 1};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp = EvenCount(arr, arr[i]);
            if (temp >= count) {
                count = temp;
                element = arr[i];
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
        System.out.println(element);

    }

//    static int[] MergeSort (int[] arr) {
//        if (arr.length == 1) {
//            return arr;
//        }
//
//    }

    static void Sort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }

        }
    }

    static int EvenCount (int[] arr, int target) {
        int count = 0;
        if (target%2 == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                count++;
            }
            return count;
        }

    }
}
