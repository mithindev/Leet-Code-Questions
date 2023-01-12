package JANUARY.DAY12;
import java.util.Arrays;

public class FirstPositiveInt1 {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 2, 1, 1};

        Arrays.sort(arr1);
        int len = countPositive(arr1);
        int[] arr = new int[len];
        for (int i = 0,k=0; i < arr1.length; i++) {
            if (arr1[i] > 0 ) {
                arr[k++] = arr1[i];
            }
        }

        int l = rmDup(arr);

        int[] ans = new int[l];

        for (int i = 0; i < l; i++) {
            ans[i] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
        for (int i = 1; i <= ans.length; i++) {
            if (ans[i-1] != i) {
                System.out.println(i);
                break;
            }

        }
        System.out.println(ans.length+1);
    }


    static int countPositive (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    static int rmDup (int[] arr) {
        if (arr.length <=1) {
            return arr.length;
        }
        int j = 0;
        int[] ans = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                ans[j++] = arr[i-1];
            }
        }
        ans[j++] = arr[arr.length-1];
        for (int i = 0; i < j; i++) {
            arr[i] = ans[i];
        }
        return j;
    }
}
