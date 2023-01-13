package JANUARY.DAY13;

//287. Find the Duplicate Number

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.

//public class FindtheDuplicateNumber {
//
//}
// solution1:-
class FindtheDuplicateNumber {
    public int findDuplicate(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            if (count(arr, arr[i]) >= 2) {
                return arr[i];
            }
        }
        return -1;

    }

    public int count (int[] arr, int target) {
        int ans = 0;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] == target) {
                ans++;
            }
        }
        return ans;
    }
}

