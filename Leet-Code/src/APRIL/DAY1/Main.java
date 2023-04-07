package APRIL.DAY1;

public class Main {
    public static void main(String[] args) {

    }

    static int subtractProductAndSum(int num) {
        int product = 1;
        int sum = 0;

        while (num > 0) {
            int temp = num % 10;
            product *= temp;
            sum += temp;
            num /= 10;
        }
        return product - sum;
    }
}
