//package JANUARY.SOLUTIONS_SNIPPETS;
//
//class Solution {
//    public:
//    double myPow(double x, int n) {
//        return pow(x, n);
//    }
//};
//
//class Solution {
//    public double myPow(double x, int y) {
//        if (y == 0) {
//            return 1;
//        }
//        if (y < 0) {
//            y = y*-1;
//            x = 1/x;
//            if (y == Integer.MIN_VALUE) {
//                y--;
//                return myPow (x*x, y/2);
//            }
//        }
//        if (y%2 == 0) {
//            return myPow (x*x, y/2);
//        } else {
//            return x*myPow (x*x, (y-1)/2);
//        }
//
//    }
//}