package JANUARY.DAY30;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        Arrays.sort(arr);
        for (int i = 1; i <arr.length; i++) {
            if (arr[i-1] == arr[i]) {
//                return true;
                System.out.println(true);
            }
        }
//        return false;
        System.out.println(false);
    }

}
