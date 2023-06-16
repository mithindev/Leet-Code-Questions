// Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int ans = Integer.MIN_VALUE;
        int level = 0;
        List<List<Integer>> BFS = levelOrder(root);

        for (int i = 0; i < BFS.size(); i++) {
            if (sum (BFS.get(i)) > ans) {
                ans = sum(BFS.get(i));
                level = i + 1;
            }
        }

        return level;
    }

    public int sum(List<Integer> list) {
        int ans = 0;
        for (int i : list) {
            ans += i;
        }
        return ans;
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();

        if (root == null) {
            return outer;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int sizeOfLevel = queue.size();
            List<Integer> inner = new ArrayList<>();

            for (int i = 0; i < sizeOfLevel; i++) {
                TreeNode temp = queue.poll();

                inner.add(temp.val);

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

            }
            
            outer.add(inner);
            
        }

        return outer;

    }
}