package FEBRUARY.DAY17;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 6, 4, 4, 4, 4, 4, 4, 4};
        System.out.println(ans (arr));

    }

    static int ans (int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique = unique ^ num;
        }
        return unique;
    }
}
