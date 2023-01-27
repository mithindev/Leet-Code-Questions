package JANUARY.DAY27;
//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//
//        Return the single element that appears only once.
//
//        Your solution must run in O(log n) time and O(1) space.


// How I think ?
//Here the array is sorted , hence immediately think of Binary Search

public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        int ans = solution(arr);
        System.out.println(ans);

    }

    static int solution (int[] arr) {
        int s = 0;
        int e = arr.length -1;

        while (s < e) {
            int mid = (s+e)/4 *2; // to always have it as even.
            if (arr[mid] != arr[mid+1]) {
                e = mid;
            } else {
                s = mid + 2;
            }
        }
        return arr[e];
    }

    static int Sol (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (count(arr, arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }

    static int count (int[] arr, int target) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                cnt++;
            }
        }
        return cnt;
    }
}
