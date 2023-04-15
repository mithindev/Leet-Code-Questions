package APRIL.DAY14;

public class Main {
    public static void main(String[] args) {
        int color[] = {1, 3, 3, 1};
        int radius[] = {2, 5, 5, 2};

        System.out.println(finLength(3, color, radius));
    }

    public static int finLength(int N, int[] color, int[] radius) {
        int ans = 0;

        for (int i = 0; i < N - 1;) {
            if (color[i] != color[i + 1] && radius[i] != radius[i + 1]) {
                ans++;
                i++;
            } else {
                i += 2;
            }
        }
        return ans + 1;
    }
}
