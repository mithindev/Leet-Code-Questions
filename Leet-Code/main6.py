# # # # # from typing import List


# # # # # class Solution:
# # # # #     def helper(self, coins, amount):
# # # # #         # BASE CASE
# # # # #         if amount == 0:
# # # # #             return 0
# # # # #         if amount < 0:
# # # # #             return 10000000
        
# # # # #         minimum = 10000000

# # # # #         for i in coins:
# # # # #             ans = self.helper(coins, amount - i)
# # # # #             if ans != 10000000:
# # # # #                 minimum = min(minimum, ans + 1)
        
# # # # #         return minimum  

# # # # #     def coinChange(self, coins: List[int], amount: int) -> int:
        
# # # # #         return self.helper(coins, amount)


# # # # # solution = Solution()
# # # # # print(solution.coinChange([1, 2, 5], 11))


# # # # # class Solution:
# # # # #     def helper(self, n, row):
# # # # #         ans = row

# # # # #         # BASE CASE
# # # # #         if n == 0:
# # # # #             return ans

# # # # #         for i in row:
# # # # #             if i == '0':
# # # # #                 ans += '1'
# # # # #             else:
# # # # #                 ans += '0'
        
# # # # #         return self.helper(n - 1, ans)
    
# # # # #     def kthGrammar(self, n: int, k: int) -> int:
# # # # #         ans = self.helper(n, '0')

# # # # #         return int(ans[k])

# # # # # solution = Solution()
# # # # # print(solution.kthGrammar(1, '0'))


# # # # class Solution:
# # # #     def helper(self, n, row):
# # # #         ans = row

# # # #         # BASE CASE
# # # #         if n == 0:
# # # #             return ans

# # # #         for i in row:
# # # #             if i == '0':
# # # #                 ans += '1'
# # # #             else:
# # # #                 ans += '0'
        
# # # #         return self.helper(n - 1, ans)
    
# # # #     def kthGrammar(self, n: int, k: int) -> int:
# # # #         #BASE CASE
# # # #         if n == 0 or k == 1:
# # # #             return 0

# # # #         mid = pow(2, n - 1) // 2

# # # #         ans = 0

# # # #         if k <= mid:
# # # #             ans = self.kthGrammar(n - 1, k)
# # # #         else:
# # # #             ans = 1 ^ self.kthGrammar(n - 1, k - mid)

# # # #         return ans 



# # # # solution = Solution()
# # # # n = 2
# # # # k = 2
# # # # result = solution.kthGrammar(n, k)
# # # # print(result)


# # # # for i in range (5, 1 - 1, -1):
# # # #   print(i, ',') 


# # # # class Solution:
# # # #     def isPalindrome(self, word, i, j, dp):
# # # #         # BASE CASE
# # # #         if j <= i:
# # # #             return True

# # # #         if dp[i][j] != -1:
# # # #             return dp[i][j]

# # # #         if word[i] == word[j]:
# # # #             dp[i][j] = self.isPalindrome(word, i + 1, j - 1, dp)
# # # #             return dp[i][j]
# # # #         else:
# # # #             dp[i][j] = False
# # # #             return False

# # # #     def longestPalindrome(self, word: str) -> str:
# # # #         dp = [[-1 for _ in range(len(word))] for _ in range(len(word))]
# # # #         ans = ""

# # # #         for i in range(len(word)):
# # # #             for j in range(len(word) - 1, i - 1, -1):
# # # #                 if self.isPalindrome(word, i, j, dp) and (j - i + 1) > len(ans):
# # # #                     ans = word[i:j+1]

# # # #         return ans

# # # solution = Solution()
# # # print(solution.longestPalindrome("babad"))

# # # Definition for a binary tree node.
# # # class TreeNode:
# # #     def __init__(self, val=0, left=None, right=None):
# # #         self.val = val
# # #         self.left = left
# # #         self.right = right

# # class Solution:
# #     def helper(self, parent, node, target):
# #         # BASE CASE
# #         if not node:
# #             return None

# #         node.left = self.helper(node, node.left, target)
# #         node.right = self.helper(node, node.right, target)

# #         if not node.left and not node.right and node.val == target:
# #             return None

# #         return node

# #     def removeLeafNodes(self, root: Optional[TreeNode], target: int) -> Optional[TreeNode]:
# #         if not root:
# #             return None

# #         root = self.helper(None, root, target)

# #         return root


# from typing import List


# class Solution:
#     def helper(self, num):
#         ans = 2
#         _sum = 1 + num

#         for i in range(2, int(num ** 0.5) + 1):
#             if num % i == 0:
#                 ans += 1
#                 _sum += i
#             if ans > 4:
#                 return 0

#         if ans == 4:
#             return _sum
#         else:
#             return 0

#     def sumFourDivisors(self, nums: List[int]) -> int:
#         ans = 0
#         for i in nums:
#             ans += self.helper(i)

#         return ans
    

# solution = Solution()
# print(solution.sumFourDivisors([21]))


# print(type(bin(4)))

from typing import List

class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        ans = sorted(arr, key=lambda x: (bin(x)[2:].count('1'), x))
        return ans


solution = Solution()

print(solution.sortByBits([0, 1, 2, 3, 4, 5, 6, 7]))