package JANUARY.DAY13;


//public class Count {
//}

class Solution {
    public int singleNumber(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            if (count(arr, arr[i]) == 1) {
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