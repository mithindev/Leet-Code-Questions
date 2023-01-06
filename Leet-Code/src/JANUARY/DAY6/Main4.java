package JANUARY.DAY6;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1};
        Arrays.sort(arr);
        int count = 0;
        int cost = 7;
        int i = 0;

        while (cost > 0) {
            cost -= arr[i];
            count++;
            i++;
        }
        System.out.println(count);

    }


}
