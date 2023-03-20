package MARCH.DAY20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);

        int option = 1;
        int value = 6;
        int index = 1;
        ArrayList<Integer> ans;

        while (option != 8) {
            System.out.print("Enter your option :");
            option = in.nextInt();

            switch (option) {
                case 1:
                    ans = Insert_Value(arr, value);
//                    System.out.println(Arrays.toString(new ArrayList[]{ans}));
                    MyPrint(ans);
                    break;
                case 2:
                    ans = Insert_Value_position(arr, value, index);
                    MyPrint(ans);                    break;
                case 3:
                    ans = Remove_Value(arr, value);
                    MyPrint(ans);                    break;
                case 4:
                    ans = Remove_Value_position(arr, value, index);
                    MyPrint(ans);                    break;
                case 5:
                    int[] temp = Modify(arr, value, index);
                    System.out.println(Arrays.toString(temp));
                    break;
                case 6:
                    System.out.println(arr.length);
                    break;
                case 7:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 8:
                    System.out.println("Exit!");
            }


        }


    }

    static ArrayList<Integer> Insert_Value_position (int[] arr, int value, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            list.add(arr[i]);
        }
        list.add(value);
        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
    static ArrayList<Integer> Remove_Value_position (int[] arr, int value, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            if (i == index) {
                continue;
            } else {
                list.add(arr[i]);
            }
        }
        return list;
    }

    static ArrayList<Integer> Insert_Value (int[] arr, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.add(value);
        return list;
    }

    static ArrayList<Integer> Remove_Value (int[] arr, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    static int[] Modify (int[] arr, int value, int index) {
        arr[index] = value;
        return arr;
    }

    static void MyPrint (ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + ", ");
        }
        System.out.println();
    }

}
