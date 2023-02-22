package FEBRUARY.DAY18;

public class isSoetedUsingRecursion {
    public static void main(String[] args) {

    }
    static boolean isSorted (int[] arr, int index) {
        index = 0;

        if (index == arr.length-1) {
            return true;
        }

        return (arr[index + 1] > arr[index] && isSorted(arr, index + 1));

    }
}
