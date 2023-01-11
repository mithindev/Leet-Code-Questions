package JANUARY.DAY11;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println(i);
            }

        }
    }
}
