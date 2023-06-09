package JUNE.DAY4;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        System.out.println(nextGreatestLetter(arr, 'a'));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        for (char ch : letters) {
            if (ch > target) {
                return ch;
            }
        }

        return letters[0];

    }
}
