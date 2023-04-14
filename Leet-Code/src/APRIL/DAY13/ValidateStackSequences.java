package APRIL.DAY13;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        System.out.println(validateStackSequences(pushed, popped));

    }

    static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> temp = new Stack<>();

        int i = 0;

        for (int num : pushed) {
            temp.push(num);

            while (temp.peek() == popped[i]) {
                temp.pop();
                i++;
            }
        }

//        while (i <= pushed.length && j < pushed.length) {
//            if (i < pushed.length && pushed[i] != popped[j]) {
//                temp.push(pushed[i]);
//                i++;
//            } else if (i < pushed.length && pushed[i] == popped[j]) {
//                temp.push(pushed[i]);
//                temp.pop();
//                i++;
//                j++;
//            } else {
//                temp.pop();
//                j++;
//            }


//            else if (i == pushed.length - 1) {
//                temp.push(pushed[i]);
//                temp.pop();
//                i++;
//                j++;
//            }
//            else if(i < pushed.length - 1){
//                temp.push(pushed[i]);
//                temp.pop();
//                j++;
//            }

        return temp.isEmpty();
    }
}
