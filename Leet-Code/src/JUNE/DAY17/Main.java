package JUNE.DAY17;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] logs = {"./", "../", "./"};

        System.out.println(minOperations(logs));
    }

    static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<String>();

        for (String log : logs) {
            if (stack.isEmpty()) {
                continue;
            } else if (log.equals("../")) {
                stack.pop();
            } else if (log.equals("./")) {
                continue;
            } else {
                stack.push(log);
            }

        }

        return stack.size();
    }
}
