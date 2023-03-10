package MARCH.DAY10;

import java.lang.Math;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};

        System.out.println(containsNearbyDuplicate(arr, 1));
        
    }

    static boolean containsNearbyDuplicate(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] & Math.abs(j - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
