# Definition for a binary tree node.

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

from typing import List, Optional

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
    
    def removeSubtree(self, root, node_val):
        if root is None:
            return root
        dup = root
        queue = [dup]

        while queue:
            temp = queue.pop(0)

            if (temp.left):
                queue.append(temp.left)
                if temp.left.val == node_val:
                    temp.left = None
                    return root

            if (temp.right):
                queue.append(temp.right)
                if temp.right.val == node_val:
                    temp.right = None
                    return root

    def treeQueries(self, root: Optional[TreeNode], queries: List[int]) -> List[int]:
        ans = []
        for i in queries:
            # temp = root
            temp = self.removeSubtree(root, i)
            ans.append(self.maxDepth(temp) - 1)
        return ans
    
    def print_binary_tree(self, root):
      if root is not None:
          # Recursively print the left subtree
          self.print_binary_tree(root.left)
          
          # Print the current node's value
          print(root.val, end=" ")  # Use print() instead of self.print()
          
          # Recursively print the right subtree
          self.print_binary_tree(root.right)


# Example usage
solution = Solution()
root = TreeNode(5)
root.left = TreeNode(8)
root.right = TreeNode(9)
root.left.left = TreeNode(2)
root.left.right = TreeNode(1)
root.right.left = TreeNode(3)
root.right.right = TreeNode(7)
root.left.left.left = TreeNode(4)
root.left.left.right = TreeNode(6)
# print(solution.treeQueries(root, [3, 2, 4, 8]))

temp = solution.removeSubtree(root, 4)
# solution.print_binary_tree(temp)
print(solution.maxDepth(temp))
print(solution.treeQueries(root, [3, 2, 4, 8]))

# print(solution.removeSubtree(root, 4))