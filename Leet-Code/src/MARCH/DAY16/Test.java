package MARCH.DAY16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ - * /");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(ch == '+'){
            System.out.println("Addition "+(a+b));
        }
//        else if(ch.equals("-")){
//            System.out.println("Subtraction "+(a-b));
//        }
//        else if(ch.equals("*")){
//            System.out.println("Multiplication "+(a*b));
//        }
//        else if(ch.equals("/")){
//            System.out.println("Division "+(a/b));
//        }
//        else{
//            System.out.println("Error");
//        }
    }
}
