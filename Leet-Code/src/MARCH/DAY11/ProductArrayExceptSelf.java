package MARCH.DAY11;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {

    }

    static int[] productExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];

        if (prod(arr) == 0) {
            int product = ProdWithoutZeroes(arr);
            for (int i = 0; i < ans.length; i++) {
                if (arr[i] != 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = product;
                }
            }
        } else {
            int product = prod(arr);
            for (int i = 0; i < ans.length; i++) {
                ans[i] = product / arr[i];
            }
        }
        return ans;
    }

    static int prod (int[] arr) {
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    static int ProdWithoutZeroes (int[] arr) {
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                product *= arr[i];
            }
        }
        return product;

    }

}
