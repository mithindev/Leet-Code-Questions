package JUNE.DAY18;

public class Main {

    public static void main(String[] args) {
        System.out.println(distanceTraveled(9,  2));
    }

    static int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank -5 >= 0) {
            distance += 50;
            mainTank -= 5;

            if (additionalTank >= 1) {
                additionalTank -= 1;
                mainTank++;
            }
        }

        while (mainTank > 0) {
            distance += 10;
            mainTank--;
        }

        return distance;
    }
}
