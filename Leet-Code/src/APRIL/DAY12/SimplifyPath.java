package APRIL.DAY12;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str = "/home//foo/";
        System.out.println(simplifyPath(str));

    }

    static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");

        for (String val : str) {
            if (val.equals(".")) {
                continue;
            }
            if (val.isEmpty()) {
                continue;
            }
            if (val.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(val);
            }
        }
        return "/" + String.join("/", stack);
    }
}