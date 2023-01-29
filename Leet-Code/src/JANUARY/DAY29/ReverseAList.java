package JANUARY.DAY29;
import java.util.ArrayList;
import java.util.List;

public class ReverseAList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }

        for (int i : list) {
            System.out.printf("%d, ",i);
        }

    }

    static void reverse (List<Integer> list) {
        List<Integer> ans = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            ans.add(list.get(list.size()-i-1));
        }
        list = ans;
    }
}
