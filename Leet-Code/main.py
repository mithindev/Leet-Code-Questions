# # # # # # from typing import List

# # # # # # def index(arr, target, l):
# # # # # #     ans = ""
# # # # # #     for i in range(len):
# # # # # #         if arr[i] == target:
# # # # # #             ans += str(i)
# # # # # #     return ans

# # # # # # def solver(s, i):
# # # # # #     ans = 0
# # # # # #     for x in s:
# # # # # #         ans += abs(int(x) - i)
# # # # # #     return ans
     

# # # # # # def distance(nums: List[int]) -> List[int]:
# # # # # #     ans = []
# # # # # #     l = len(nums)
# # # # # #     dict = {}
# # # # # #     for i in set(nums):
# # # # # #         dict[i] = index(nums, i)

# # # # # #     for i in range(l):
# # # # # #         temp = nums[i]
# # # # # #         indeces = dict[temp]
# # # # # #         ans.append(solver(indeces, i))
# # # # # #     return ans
        




# # # # # # # lst = [1, 1, 2, 3, 1, 1, 3]
# # # # # # # print(lst.index(1, 0, len(lst)))

# # # # # import sys
# # # # # from typing import List

# # # # # def minOperations(arr: List[int]) -> int:

# # # # #     l = len(arr)
# # # # #     arr = list(set(arr))

# # # # #     arr.sort()
# # # # #     ans = -sys.maxsize - 1

# # # # #     e = 0
# # # # #     for s in range(l):
# # # # #         while (e < len(arr) and arr[e] < arr[s] + l):
# # # # #             e += 1
        
# # # # #         sw = e - s
# # # # #         ans = max(ans, sw)
    
# # # # #     return l - ans


# # # # #     # for i in arr:
# # # # #     #     sw = 0
            
# # # # #     #     if (i + l < arr[len(arr) - 1]):
# # # # #     #         for j in range (i, i + l):
# # # # #     #             if j in arr:
# # # # #     #                 sw += 1

# # # # #     #     if sw > ans:
# # # # #     #         ans = sw
        
# # # # #     # return l - ans
        

# # # # # print(minOperations([4,2,5,3]))

# # # # def getTo(item, head):
# # # #         ListNode temp = head

# # # #         while (temp != null):
# # # #             if (temp.val == item):
# # # #                 return temp

# # # # def numComponents(self, head: Optional[ListNode], arr: List[int]) -> int:
# # # #         ans = 0

# # # #         for i in range (len - 1):
# # # #             ListNode temp = getTo(arr[i], head)
# # # #             if (arr[i + 1] == temp.next.val):
# # # #                 ans += 1
        
# # # #         return ans

# # # from typing import List


# # # def helper(str) -> int:
# # #         s = str.find('|')
# # #         e = str.rfind('|')

# # #         count = 0

# # #         for i in range(s + 1, e):
# # #             if str[i] == '*':
# # #                 count += 1
        
# # #         return count

# # # def platesBetweenCandles(s: str, queries: List[List[int]]) -> List[int]:
# # #         ans = []

# # #         for i in queries:
# # #             ans.append(helper(s[i[0]: i[1] + 1]))
        
# # #         return ans

# # # print(platesBetweenCandles("**|**|***|", [[2,5],[5,9]]))


# # # from typing import Optional


# # # class TreeNode:
# # #     def __init__(self, val=0, left=None, right=None):
# # #         self.val = val
# # #         self.left = left
# # #         self.right = right
        
# # # class Solution:
# # #     def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
# # #         if not root:
# # #             return False

# # #         node = root
# # #         stack = []
        
# # #         while node or stack:
# # #             Sum = 0
# # #             while node:
# # #                 Sum += node.val
# # #                 stack.append(node)
# # #                 node = node.left 
# # #             if Sum == targetSum:
# # #                 return True
            
# # #             node = stack.pop()
# # #             Sum -= node.val
# # #             node = node.right
        
# # #         return False

# # # print(hasPathSum([5,4,8,11,null,13,4,7,2,null,null,null,1], 22))


# # from typing import Optional

# # class TreeNode:
# #     def __init__(self, val=0, left=None, right=None):
# #         self.val = val
# #         self.left = left
# #         self.right = right

# # class Solution:
# #     def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
# #         if not root:
# #             return False

# #         stack = [root]
# #         Sum = 0

# #         while stack:
            
# #             # while node:
# #             #     Sum += node.val
# #             #     stack.append(node)
# #             #     node = node.left
# #             # if Sum == targetSum:
# #             #     return True

# #             # node = stack.pop()
# #             # Sum -= node.val
# #             # node = node.right

# #             node = stack.pop()
# #             Sum += node.val

# #             if not node.left and not node.right:
# #                 if Sum ==  targetSum:
# #                     return True
# #             if node.left:
# #                 stack.append(node.left)
# #             if node.right:
# #                 stack.append(node.right)

# #         return False

# # # You should create a TreeNode tree before using hasPathSum method.
# # # Example tree creation:
# # #   5
# # #  / \
# # # 4   8
# # # /   / \
# # # 11  13  4
# # # /  \    \
# # # 7   2    1

# # # Instantiate the tree nodes and build the tree here

# # # Example usage:
# # root = TreeNode(5)
# # root.left = TreeNode(4)
# # root.right = TreeNode(8)
# # root.left.left = TreeNode(11)
# # root.right.left = TreeNode(13)
# # root.right.right = TreeNode(4)
# # root.left.left.left = TreeNode(7)
# # root.left.left.right = TreeNode(2)
# # root.right.right.right = TreeNode(1)
# # solution = Solution()
# # print(solution.hasPathSum(root, 22))

# from typing import List

# def fullBloomFlowers(flowers: List[List[int]], people: List[int]) -> List[int]:
#         bloom = {}

#         ans = []

#         for i in flowers:
#             for j in range (i[0], i[1] + 1):
#                 if j not in bloom.keys():
#                     bloom[j] = 0
#                     bloom[j] += 1
#                 else:
#                     bloom[j] += 1

#         for i in people:
#             ans.append(bloom[i])
        
#         return ans

# print(fullBloomFlowers([[1,6],[3,7],[9,12],[4,13]], [2,3,7,11]))

import pandas as pd
import numpy as np

dates = pd.date_range("20130101", periods = 6)

print(dates)

df = pd.DataFrame(np.random.randn(6, 4), index = dates, columns = list("ABCD"))
print(df)