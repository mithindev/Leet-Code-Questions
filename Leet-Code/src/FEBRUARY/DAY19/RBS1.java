package FEBRUARY.DAY19;

import java.util.Arrays;

public class RBS1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,0,1,2,4,4};
        System.out.println(search(arr, 3));
//        System.out.println(findPivot(arr));
//        System.out.println(binarySearch(arr, 3));
//        System.out.println(binarySearch(arr, 3));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if pivot == -1; then the array is not rotated;

        if (pivot == -1) {
            return binarySearch(arr, target);
        }

        if (target == arr[pivot]) {
            return pivot;
        }
        if (target >= arr[0] && target < arr[pivot]) {
            return binarySearch(Arrays.copyOfRange(arr, 0, pivot), target);
        } else {
            int temp =  binarySearch(Arrays.copyOfRange(arr, pivot+1, arr.length), target);
            if (temp == -1) {
                return temp;
            } else {
                return pivot + 1 + temp;
            }
        }
    }

    static int findPivot (int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s < e) {
            int mid = s + (e - s)/2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[s] >= arr[mid]) {
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch (int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }


}
