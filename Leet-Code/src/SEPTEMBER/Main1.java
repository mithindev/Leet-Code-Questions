//package SEPTEMBER;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class Main1 {
//    public static void main(String[] args) {
//
//    }
//
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> outer = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> inner = new ArrayList<>();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode temp = queue.poll();
//                inner.add(temp.v);
//
//            }
//
//        }
//    }
//}
