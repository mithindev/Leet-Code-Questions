package MARCH.DAY19;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));

    }

    static int romanToInt(String s) {
        int ans = RomToNum(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (RomToNum(s.charAt(i)) >= RomToNum(s.charAt(i + 1))) {
                ans += RomToNum(s.charAt(i));
            } else {
                ans -= RomToNum(s.charAt(i));
            }
        }
        return ans;
    }

    static int RomToNum (char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
