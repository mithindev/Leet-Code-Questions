package JANUARY.DAY29;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EliminationGame {
    public static void main(String[] args) {
        int ans = lastRemaining(9);
        System.out.println(ans);
    }

    static int lastRemaining(int n) {
        int alt = 1;
        List<Integer> list = new ArrayList<>();



        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i : list) {
            System.out.printf("%d, ",i);
        }
        System.out.println("");

        while (list.size() > 1) {
            if (alt%2 == 1) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 1; i < list.size(); i += 2) {
                    ans.add(list.get(i));
                }
                list = ans;
                for (int i : list) {
                    System.out.printf("%d, ",i);
                }
                System.out.println("");
                alt++;
            } else {
                List<Integer> ans = new ArrayList<>();
                for (int i = list.size()-2; i >=0; i -= 2) {
                    ans.add(list.get(i));
                }
                list = ans;
                Collections.reverse(list);
                alt++;
                for (int i : list) {
                    System.out.printf("%d, ",i);
                }
                System.out.println("");
            }
        }
        return list.get(0);
    }

    static void reverse (List<Integer> list) {
        List<Integer> ans = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            ans.add(list.get(i));
        }
        list  = ans;
    }


}
