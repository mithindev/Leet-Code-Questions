package JANUARY.DAY12;

public class MaximumCount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, -1, -9, -8};
        int pos = 0;
        int neg = 0;

        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > 0) {
                pos++;
            }
            if (arr[i] < 0) {
                neg++;
            }
        }

        if (pos >= neg) {
            System.out.println(pos);
        } else if (neg > pos) {
//            return neg;
            System.out.println(neg);
        }
//        return 0;

    }
}
