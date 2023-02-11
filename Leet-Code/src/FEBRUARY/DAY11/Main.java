package FEBRUARY.DAY11;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int ans = findSpecialInteger(arr);

        System.out.println(ans);

    }

    static int findSpecialInteger(int[] arr) {
        int max = 0;
        int count = 0;
        int i = 0;
        while (i < arr.length-1) {
            while (arr[i] == arr[i+1]) {
                count++;
//                i++;
            }
            if (count > max) {
                max = count;
            }
            count = 0;
            i++;
        };
        return max;

    }

}
