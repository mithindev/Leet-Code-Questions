class Solution {
  static int[] getAverages(int[] arr, int k) {
       int len = arr.length;
       int range = 2*k + 1;

       int[] ans = new int[len];

       for (int i = 0; i < len; i++) {
           ans[i] = -1;
       }

       if (range > len) {
           return ans;
       }

       long avg = 0;

       for (int i = 0; i < range; i++) {
           avg += arr[i];
       }

       for (int i = k; i + k < len; i++) {
           ans[i] = (int) (avg/(range));

           if (i + k + 1 < len) {
               avg += arr[i + k + 1] - arr[i - k];
           }
       }
       return ans;
   }
}