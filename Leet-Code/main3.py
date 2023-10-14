# # # # Definition for a binary tree node.

# # # class TreeNode:
# # #     def __init__(self, val=0, left=None, right=None):
# # #         self.val = val
# # #         self.left = left
# # #         self.right = right

# # # from typing import List, Optional

# # # class Solution:
# # #     def maxDepth(self, root: Optional[TreeNode]) -> int:
# # #         if root is None:
# # #             return 0
        
# # #         return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
    
# # #     def removeSubtree(self, root, node_val):
# # #         if root is None:
# # #             return root
# # #         dup = root
# # #         queue = [dup]

# # #         while queue:
# # #             temp = queue.pop(0)

# # #             if (temp.left):
# # #                 queue.append(temp.left)
# # #                 if temp.left.val == node_val:
# # #                     temp.left = None
# # #                     return root

# # #             if (temp.right):
# # #                 queue.append(temp.right)
# # #                 if temp.right.val == node_val:
# # #                     temp.right = None
# # #                     return root

# # #     def treeQueries(self, root: Optional[TreeNode], queries: List[int]) -> List[int]:
# # #         ans = []
# # #         for i in queries:
# # #             # temp = root
# # #             temp = self.removeSubtree(root, i)
# # #             ans.append(self.maxDepth(temp) - 1)
# # #         return ans
    
# # #     def print_binary_tree(self, root):
# # #       if root is not None:
# # #           # Recursively print the left subtree
# # #           self.print_binary_tree(root.left)
          
# # #           # Print the current node's value
# # #           print(root.val, end=" ")  # Use print() instead of self.print()
          
# # #           # Recursively print the right subtree
# # #           self.print_binary_tree(root.right)


# # # # Example usage
# # # solution = Solution()
# # # root = TreeNode(5)
# # # root.left = TreeNode(8)
# # # root.right = TreeNode(9)
# # # root.left.left = TreeNode(2)
# # # root.left.right = TreeNode(1)
# # # root.right.left = TreeNode(3)
# # # root.right.right = TreeNode(7)
# # # root.left.left.left = TreeNode(4)
# # # root.left.left.right = TreeNode(6)
# # # # print(solution.treeQueries(root, [3, 2, 4, 8]))

# # # temp = solution.removeSubtree(root, 4)
# # # # solution.print_binary_tree(temp)
# # # print(solution.maxDepth(temp))
# # # print(solution.treeQueries(root, [3, 2, 4, 8]))

# # # # print(solution.removeSubtree(root, 4))

# # from typing import List


# # def numberOfArithmeticSlices(arr: List[int]) -> int:
# #         if len(arr) < 3:
# #             return 0
        
# #         ans = 0

# #         for i in range(len(arr) - 2):
# #             d = arr[i + 1] - arr[i]
# #             j = i + 2

# #             while j < len(arr) and arr[j] - arr[j - 1] == d:
# #                 ans += 1
# #                 j += 1

# #         return ans

# # print(numberOfArithmeticSlices([1,2,3,4]))

# from typing import List

# def lastVisitedIntegers(words: List[str]) -> List[int]:
#         ans = []
#         stack = []
#         ptr = -1
        
#         for i in words:
#             if i != "prev":
#                 stack.append(int(i))
#                 ptr = len(stack) - 1
#             else:
#                 if (ptr >= 0):
#                     ans.append(stack[ptr])
#                     ptr -= 1
#                 else:
#                     ans.append(-1)
        
#         return ans

# print(lastVisitedIntegers(["1","2","prev","prev","prev"]))

from typing import List

def alternateLCS (arr, words):
    ans = [0]
    if len(arr) == 0:
            return []

    for i in range(1, len(arr)):
            if arr[i] != arr[i - 1]:
                ans.append(i)
    for i in range(1, len(arr)):
             if hammingDistance(words[i], words[i - 1]) != 1:
                  ans.remove(i - 1)

    return ans
        


        
        
# print(alternateLCS([1,2]))

def hammingDistance (s1, s2):
        ans = 0

        if len(s1) != len(s2):
            return ans
        
        for i in range (0, len(s1)):
            if s1[i] != s2[i]:
                ans += 1
        return ans

print(hammingDistance('bdb', 'aaa'))

# def alternateLCS (arr, words):
#         if len(arr) == 0:
#             return []
        
#         ans = []

#         if arr[0] != arr[1] and hammingDistance(words[0], words[1]) == 1:
#              ans.append(0)
        

#         for i in range(1, len(arr)):
#             temp = hammingDistance(words[i], words[i - 1])
#             if arr[i] != arr[i - 1] and temp == 1:
#                 ans.append(i)

#         return ans
    
def getWordsInLongestSubsequence(n: int, words: List[str], groups: List[int]) -> List[str]:
        ans = []
        
        LCS = alternateLCS(groups, words)
        
        for i in LCS:
            ans.append(words[i])
        
        return ans
    
print(getWordsInLongestSubsequence(3, ["bdb","aaa","ada"], [2,1, 3]))