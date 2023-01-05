package JANUARY.DAY5;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = rmDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }

    static int rmDuplicates (int[] arr) {
        if (arr.length < 2) {
            return arr.length;
        }
        int[] ans = arr;
        int[] temp = new int[arr.length];
        int j = 0;
        sort(ans);
        for (int i = 0; i < arr.length-1;i++) {
            if (ans[i] != ans[i+1]) {
                temp[j++] = ans[i];
            }
        }

        temp[j++] = ans[ans.length-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    static void sort (int[] arr) {
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

}
