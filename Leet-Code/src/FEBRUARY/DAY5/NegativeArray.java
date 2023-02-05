package FEBRUARY.DAY5;

public class NegativeArray {
    public static void main(String[] args) {

    }

    static void negative (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
}
