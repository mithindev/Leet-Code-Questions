package FEBRUARY.DAY1;

public class SortColors {
    public static void main(String[] args) {

    }

    static void BS (int[] arr) {
        if (arr.length == 0 || arr == null) {
            return;
        }
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
