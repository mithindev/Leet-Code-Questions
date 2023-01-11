package JANUARY.DAY11;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr.length; l++) {
                        if (i == j || i == k || i == l || j == j || j == l || l == k) {
                            ;
                        }
                        if ((arr[i] + arr[j] + arr[k] + arr[l]) == 0) {
                            System.out.println(arr[i]);
                            System.out.println(arr[j]);
                            System.out.println(arr[k]);
                            System.out.println(arr[l]);
                            System.out.println("_____");
                        }

                    }

                }

            }

        }

    }


}
