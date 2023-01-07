package JANUARY.DAY7;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int n = gas.length;


        for (int i = 0;i < n;i++) {
            int fuel = gas[i];
            boolean isPossible = true;
            for (int j = 0; j < n; j++) {
                int current = (i+j)%n;
                int next = (current+1)%n;
                fuel = fuel - cost[current];

                if (fuel < 0) {
                    isPossible = false;
                    break;
                }
                fuel += gas[next];
            }
            if (isPossible) {
                System.out.println(i);
                break;
            }

        }

    }

    static int sumArray (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
