package APRIL.DAY21;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    static int findMaxConsecutiveOnes(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length;) {
            int count = 0;
            while (i < arr.length && arr[i + 1] == 1) {
                count++;
                i++;
            }
            i++;
            if (count > ans) {
                ans = count;
            }
        }
        return ans;
    }
}
