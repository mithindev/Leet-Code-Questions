package MARCH.DAY19;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        char ch1, ch2;
        System.out.print("Enter a char :");
        ch1 = (char)System.in.read();
        System.out.print("Enter a char :");
        ch2 = (char)System.in.read();
        System.out.println("The entered keys are: " + ch1 + " & " + ch2);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = in.nextLine();
        System.out.println(name);

        System.out.print("Enter a number :");
        int num = in.nextInt();
        System.out.println(num);

        int i = 0;
        for (i = 0;i < 5 ; i++);
        System.out.println(i);
    }
}
