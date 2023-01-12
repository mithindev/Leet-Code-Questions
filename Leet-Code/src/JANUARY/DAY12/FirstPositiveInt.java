package JANUARY.DAY12;
import java.util.Arrays;

public class FirstPositiveInt {
    public static void main(String[] args) {
//        int[] arr1 = {3, 4, -1, 1};
        int[] arr1 = {1, 2, 0};
        Arrays.sort(arr1);
        int len = countPositive(arr1);
        int[] arr = new int[len];
        for (int i = 0,k=0; i < arr1.length; i++) {
            if (arr1[i] >= 0 ) {
                arr[k++] = arr1[i];
            }
        }
        int temp = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == 0) {
                ;
            }else {
                if (arr[i] != i+1) {
                    System.out.println(i);
                    break;
                }
            }
        }


    }
    static int countPositive (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        return count;
    }


}
