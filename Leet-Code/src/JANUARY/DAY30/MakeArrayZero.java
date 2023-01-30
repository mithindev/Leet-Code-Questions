package JANUARY.DAY30;
import java.util.Arrays;

public class MakeArrayZero {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 5};
        System.out.println(minTerm(arr));

        int count = 0;

        while (Sum(arr) != 0) {
            int temp = minTerm (arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i] = arr[i] - temp;
                }
            }
            System.out.println(Arrays.toString(arr));
            count++;
        }

    }

    static int minTerm (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int Sum (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
