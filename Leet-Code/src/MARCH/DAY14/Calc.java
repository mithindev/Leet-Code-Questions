package MARCH.DAY14;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ch = in.next();
        System.out.println("Num 1:");
        int num1 = in.nextInt();
        System.out.println("Num 2:");
        int num2 = in.nextInt();

        switch (ch) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                if(num2!=0) System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid!");
        }
    }

    static int sum (int num) {
        int ans = 0;
        while (num > 0) {
            ans += ans%10;
            ans = ans/10;
        }
        return ans;
    }

}
