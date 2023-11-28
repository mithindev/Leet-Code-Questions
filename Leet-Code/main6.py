# # # # # # # # # # # # # # # # # # # # # # # # # # # # from typing import List


# # # # # # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #     def helper(self, coins, amount):
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         # BASE CASE
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         if amount == 0:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return 0
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         if amount < 0:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return 10000000
        
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         minimum = 10000000

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         for i in coins:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             ans = self.helper(coins, amount - i)
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             if ans != 10000000:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #                 minimum = min(minimum, ans + 1)
        
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         return minimum  

# # # # # # # # # # # # # # # # # # # # # # # # # # # #     def coinChange(self, coins: List[int], amount: int) -> int:
        
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         return self.helper(coins, amount)


# # # # # # # # # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # # # # # # # # print(solution.coinChange([1, 2, 5], 11))


# # # # # # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #     def helper(self, n, row):
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         ans = row

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         # BASE CASE
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         if n == 0:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return ans

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         for i in row:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             if i == '0':
# # # # # # # # # # # # # # # # # # # # # # # # # # # #                 ans += '1'
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #                 ans += '0'
        
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         return self.helper(n - 1, ans)
    
# # # # # # # # # # # # # # # # # # # # # # # # # # # #     def kthGrammar(self, n: int, k: int) -> int:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         ans = self.helper(n, '0')

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         return int(ans[k])

# # # # # # # # # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # # # # # # # # print(solution.kthGrammar(1, '0'))


# # # # # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # # # # #     def helper(self, n, row):
# # # # # # # # # # # # # # # # # # # # # # # # # # #         ans = row

# # # # # # # # # # # # # # # # # # # # # # # # # # #         # BASE CASE
# # # # # # # # # # # # # # # # # # # # # # # # # # #         if n == 0:
# # # # # # # # # # # # # # # # # # # # # # # # # # #             return ans

# # # # # # # # # # # # # # # # # # # # # # # # # # #         for i in row:
# # # # # # # # # # # # # # # # # # # # # # # # # # #             if i == '0':
# # # # # # # # # # # # # # # # # # # # # # # # # # #                 ans += '1'
# # # # # # # # # # # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # # # # # # # # # # #                 ans += '0'
        
# # # # # # # # # # # # # # # # # # # # # # # # # # #         return self.helper(n - 1, ans)
    
# # # # # # # # # # # # # # # # # # # # # # # # # # #     def kthGrammar(self, n: int, k: int) -> int:
# # # # # # # # # # # # # # # # # # # # # # # # # # #         #BASE CASE
# # # # # # # # # # # # # # # # # # # # # # # # # # #         if n == 0 or k == 1:
# # # # # # # # # # # # # # # # # # # # # # # # # # #             return 0

# # # # # # # # # # # # # # # # # # # # # # # # # # #         mid = pow(2, n - 1) // 2

# # # # # # # # # # # # # # # # # # # # # # # # # # #         ans = 0

# # # # # # # # # # # # # # # # # # # # # # # # # # #         if k <= mid:
# # # # # # # # # # # # # # # # # # # # # # # # # # #             ans = self.kthGrammar(n - 1, k)
# # # # # # # # # # # # # # # # # # # # # # # # # # #         else:
# # # # # # # # # # # # # # # # # # # # # # # # # # #             ans = 1 ^ self.kthGrammar(n - 1, k - mid)

# # # # # # # # # # # # # # # # # # # # # # # # # # #         return ans 



# # # # # # # # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # # # # # # # n = 2
# # # # # # # # # # # # # # # # # # # # # # # # # # # k = 2
# # # # # # # # # # # # # # # # # # # # # # # # # # # result = solution.kthGrammar(n, k)
# # # # # # # # # # # # # # # # # # # # # # # # # # # print(result)


# # # # # # # # # # # # # # # # # # # # # # # # # # # for i in range (5, 1 - 1, -1):
# # # # # # # # # # # # # # # # # # # # # # # # # # #   print(i, ',') 


# # # # # # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #     def isPalindrome(self, word, i, j, dp):
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         # BASE CASE
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         if j <= i:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return True

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         if dp[i][j] != -1:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return dp[i][j]

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         if word[i] == word[j]:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             dp[i][j] = self.isPalindrome(word, i + 1, j - 1, dp)
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return dp[i][j]
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         else:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             dp[i][j] = False
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             return False

# # # # # # # # # # # # # # # # # # # # # # # # # # # #     def longestPalindrome(self, word: str) -> str:
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         dp = [[-1 for _ in range(len(word))] for _ in range(len(word))]
# # # # # # # # # # # # # # # # # # # # # # # # # # # #         ans = ""

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         for i in range(len(word)):
# # # # # # # # # # # # # # # # # # # # # # # # # # # #             for j in range(len(word) - 1, i - 1, -1):
# # # # # # # # # # # # # # # # # # # # # # # # # # # #                 if self.isPalindrome(word, i, j, dp) and (j - i + 1) > len(ans):
# # # # # # # # # # # # # # # # # # # # # # # # # # # #                     ans = word[i:j+1]

# # # # # # # # # # # # # # # # # # # # # # # # # # # #         return ans

# # # # # # # # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # # # # # # # print(solution.longestPalindrome("babad"))

# # # # # # # # # # # # # # # # # # # # # # # # # # # Definition for a binary tree node.
# # # # # # # # # # # # # # # # # # # # # # # # # # # class TreeNode:
# # # # # # # # # # # # # # # # # # # # # # # # # # #     def __init__(self, val=0, left=None, right=None):
# # # # # # # # # # # # # # # # # # # # # # # # # # #         self.val = val
# # # # # # # # # # # # # # # # # # # # # # # # # # #         self.left = left
# # # # # # # # # # # # # # # # # # # # # # # # # # #         self.right = right

# # # # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # # # #     def helper(self, parent, node, target):
# # # # # # # # # # # # # # # # # # # # # # # # # #         # BASE CASE
# # # # # # # # # # # # # # # # # # # # # # # # # #         if not node:
# # # # # # # # # # # # # # # # # # # # # # # # # #             return None

# # # # # # # # # # # # # # # # # # # # # # # # # #         node.left = self.helper(node, node.left, target)
# # # # # # # # # # # # # # # # # # # # # # # # # #         node.right = self.helper(node, node.right, target)

# # # # # # # # # # # # # # # # # # # # # # # # # #         if not node.left and not node.right and node.val == target:
# # # # # # # # # # # # # # # # # # # # # # # # # #             return None

# # # # # # # # # # # # # # # # # # # # # # # # # #         return node

# # # # # # # # # # # # # # # # # # # # # # # # # #     def removeLeafNodes(self, root: Optional[TreeNode], target: int) -> Optional[TreeNode]:
# # # # # # # # # # # # # # # # # # # # # # # # # #         if not root:
# # # # # # # # # # # # # # # # # # # # # # # # # #             return None

# # # # # # # # # # # # # # # # # # # # # # # # # #         root = self.helper(None, root, target)

# # # # # # # # # # # # # # # # # # # # # # # # # #         return root


# # # # # # # # # # # # # # # # # # # # # # # # # from typing import List


# # # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # # #     def helper(self, num):
# # # # # # # # # # # # # # # # # # # # # # # # #         ans = 2
# # # # # # # # # # # # # # # # # # # # # # # # #         _sum = 1 + num

# # # # # # # # # # # # # # # # # # # # # # # # #         for i in range(2, int(num ** 0.5) + 1):
# # # # # # # # # # # # # # # # # # # # # # # # #             if num % i == 0:
# # # # # # # # # # # # # # # # # # # # # # # # #                 ans += 1
# # # # # # # # # # # # # # # # # # # # # # # # #                 _sum += i
# # # # # # # # # # # # # # # # # # # # # # # # #             if ans > 4:
# # # # # # # # # # # # # # # # # # # # # # # # #                 return 0

# # # # # # # # # # # # # # # # # # # # # # # # #         if ans == 4:
# # # # # # # # # # # # # # # # # # # # # # # # #             return _sum
# # # # # # # # # # # # # # # # # # # # # # # # #         else:
# # # # # # # # # # # # # # # # # # # # # # # # #             return 0

# # # # # # # # # # # # # # # # # # # # # # # # #     def sumFourDivisors(self, nums: List[int]) -> int:
# # # # # # # # # # # # # # # # # # # # # # # # #         ans = 0
# # # # # # # # # # # # # # # # # # # # # # # # #         for i in nums:
# # # # # # # # # # # # # # # # # # # # # # # # #             ans += self.helper(i)

# # # # # # # # # # # # # # # # # # # # # # # # #         return ans
    

# # # # # # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # # # # # print(solution.sumFourDivisors([21]))


# # # # # # # # # # # # # # # # # # # # # # # # # print(type(bin(4)))

# # # # # # # # # # # # # # # # # # # # # # # # from typing import List

# # # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # # #     def sortByBits(self, arr: List[int]) -> List[int]:
# # # # # # # # # # # # # # # # # # # # # # # #         ans = sorted(arr, key=lambda x: (bin(x)[2:].count('1'), x))
# # # # # # # # # # # # # # # # # # # # # # # #         return ans


# # # # # # # # # # # # # # # # # # # # # # # # solution = Solution()

# # # # # # # # # # # # # # # # # # # # # # # # print(solution.sortByBits([0, 1, 2, 3, 4, 5, 6, 7]))

# # # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # # #     def minSteps(self, s: str, t: str) -> int:
# # # # # # # # # # # # # # # # # # # # # # #         count_s = {}
# # # # # # # # # # # # # # # # # # # # # # #         count_t = {}

# # # # # # # # # # # # # # # # # # # # # # #         for char in s:
# # # # # # # # # # # # # # # # # # # # # # #             count_s[char] = count_s.get(char, 0) + 1

# # # # # # # # # # # # # # # # # # # # # # #         for char in t:
# # # # # # # # # # # # # # # # # # # # # # #             count_t[char] = count_t.get(char, 0) + 1

# # # # # # # # # # # # # # # # # # # # # # #         ans = 0
# # # # # # # # # # # # # # # # # # # # # # #         for char, freq_s in count_s.items():
# # # # # # # # # # # # # # # # # # # # # # #             freq_t = count_t.get(char, 0)
# # # # # # # # # # # # # # # # # # # # # # #             if freq_s > freq_t:
# # # # # # # # # # # # # # # # # # # # # # #                 ans += freq_s - freq_t

# # # # # # # # # # # # # # # # # # # # # # #         return ans


# # # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # # #     def minSteps(self, s: str, t: str) -> int:
# # # # # # # # # # # # # # # # # # # # # #         countS = {}
# # # # # # # # # # # # # # # # # # # # # #         countT = {}

# # # # # # # # # # # # # # # # # # # # # #         for ch in s:
# # # # # # # # # # # # # # # # # # # # # #             if ch not in countS:
# # # # # # # # # # # # # # # # # # # # # #                 countS[ch] = 1
# # # # # # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # # # # # #                 countS[ch] += 1

# # # # # # # # # # # # # # # # # # # # # #         for ch in t:
# # # # # # # # # # # # # # # # # # # # # #             if ch not in countT:
# # # # # # # # # # # # # # # # # # # # # #                 countT[ch] = 1
# # # # # # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # # # # # #                 countT[ch] += 1

# # # # # # # # # # # # # # # # # # # # # #         ans = 0
# # # # # # # # # # # # # # # # # # # # # #         for ch, count in countS.items():
# # # # # # # # # # # # # # # # # # # # # #             freq = countT.get(ch, 0)
# # # # # # # # # # # # # # # # # # # # # #             if count > freq:
# # # # # # # # # # # # # # # # # # # # # #                 ans += count - freq

# # # # # # # # # # # # # # # # # # # # # #         return ans


# # # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # # print(solution.minSteps("leetcode", "practice"))

# # # # # # # # # # # # # # # # # # # # # from typing import List


# # # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # # #     def getWinner(self, arr: List[int], k: int) -> int:
# # # # # # # # # # # # # # # # # # # # #         n = len(arr)
# # # # # # # # # # # # # # # # # # # # #         if k >= n:
# # # # # # # # # # # # # # # # # # # # #             return max(arr)
# # # # # # # # # # # # # # # # # # # # #         i = 0
# # # # # # # # # # # # # # # # # # # # #         streak = 0

# # # # # # # # # # # # # # # # # # # # #         while True:
# # # # # # # # # # # # # # # # # # # # #             winner = arr[i]
# # # # # # # # # # # # # # # # # # # # #             if arr[(i + 1) % n] < winner:
# # # # # # # # # # # # # # # # # # # # #                 streak += 1
# # # # # # # # # # # # # # # # # # # # #                 i = (i + 1) % n
# # # # # # # # # # # # # # # # # # # # #                 if streak >= k:
# # # # # # # # # # # # # # # # # # # # #                     return winner
# # # # # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # # # # #                 winner = arr[(i + 1) % n]
# # # # # # # # # # # # # # # # # # # # #                 streak = 1
            

# # # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # # print(solution.getWinner([2,1,3,5,4,6,7], 2))

# # # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # # #     def helper (self, s):
# # # # # # # # # # # # # # # # # # # #         ans = 0

# # # # # # # # # # # # # # # # # # # #         for i in s:
# # # # # # # # # # # # # # # # # # # #             ans += int(i)

# # # # # # # # # # # # # # # # # # # #         return str(ans)

# # # # # # # # # # # # # # # # # # # #     def digitSum(self, s: str, k: int) -> str:
# # # # # # # # # # # # # # # # # # # #         temp = ""

# # # # # # # # # # # # # # # # # # # #         while(len(s) != k):
# # # # # # # # # # # # # # # # # # # #             temp = self.helper(s)
# # # # # # # # # # # # # # # # # # # #             s = temp
        
# # # # # # # # # # # # # # # # # # # #         return s

# # # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # # print(solution.digitSum("11111222223", 3))


# # # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # # #     def helper (self, s):
# # # # # # # # # # # # # # # # # # #         n = len(s)

# # # # # # # # # # # # # # # # # # #         return (0.5 * n * (n + 1)) % (pow(10, 9) + 7)
    
# # # # # # # # # # # # # # # # # # #     def countHomogenous(self, word: str) -> int:
# # # # # # # # # # # # # # # # # # #         lst = {}
# # # # # # # # # # # # # # # # # # #         ans = 0

# # # # # # # # # # # # # # # # # # #         s = 0
# # # # # # # # # # # # # # # # # # #         e = 1
# # # # # # # # # # # # # # # # # # #         n = len(word)

# # # # # # # # # # # # # # # # # # #         while (e < n and s < n):
# # # # # # # # # # # # # # # # # # #             if word[e] == word[s]:
# # # # # # # # # # # # # # # # # # #                 e += 1
# # # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # # #                 temp = word[s: e]
# # # # # # # # # # # # # # # # # # #                 if temp not in lst:
# # # # # # # # # # # # # # # # # # #                     lst[temp] = 1
# # # # # # # # # # # # # # # # # # #                 else:
# # # # # # # # # # # # # # # # # # #                     lst[temp] += 1
                
# # # # # # # # # # # # # # # # # # #                 s = e
# # # # # # # # # # # # # # # # # # #                 e = s + 1
            
# # # # # # # # # # # # # # # # # # #         temp = word[s: e]
# # # # # # # # # # # # # # # # # # #         if temp not in lst:
# # # # # # # # # # # # # # # # # # #             lst[temp] = 1
# # # # # # # # # # # # # # # # # # #         else:
# # # # # # # # # # # # # # # # # # #             lst[temp] += 1

# # # # # # # # # # # # # # # # # # #         # print(lst)
# # # # # # # # # # # # # # # # # # #         for key, val in lst.items():
# # # # # # # # # # # # # # # # # # #             ans += self.helper(key) * val
        
# # # # # # # # # # # # # # # # # # #         return ans % (pow(10, 9) + 7)


# # # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # # print(solution.countHomogenous("zzzzz"))

# # # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # # #     def repeatedStringMatch(self, a: str, b: str) -> int:
# # # # # # # # # # # # # # # # # #         word = a
# # # # # # # # # # # # # # # # # #         count = 1
# # # # # # # # # # # # # # # # # #         while True:

# # # # # # # # # # # # # # # # # #             if len(a) < len(b):
# # # # # # # # # # # # # # # # # #                 a += word
# # # # # # # # # # # # # # # # # #                 count += 1
            
# # # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # # #                 if b in a:
# # # # # # # # # # # # # # # # # #                     return count
# # # # # # # # # # # # # # # # # #                 elif len(a) < 2*len(b):
# # # # # # # # # # # # # # # # # #                     a += word
# # # # # # # # # # # # # # # # # #                     count += 1
# # # # # # # # # # # # # # # # # #                 else:
# # # # # # # # # # # # # # # # # #                     break
        
# # # # # # # # # # # # # # # # # #         return -1

# # # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # # print(solution.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab", "ba"))

# # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # #     def helper (self, s):
# # # # # # # # # # # # # # # # #         n = len(s)

# # # # # # # # # # # # # # # # #         return (0.5 * n * (n + 1)) % (pow(10, 9) + 7)

# # # # # # # # # # # # # # # # #     def numSub(self, word: str) -> int:
# # # # # # # # # # # # # # # # #         lst = {}
# # # # # # # # # # # # # # # # #         ans = 0

# # # # # # # # # # # # # # # # #         s = 0
# # # # # # # # # # # # # # # # #         e = 1
# # # # # # # # # # # # # # # # #         n = len(word)

# # # # # # # # # # # # # # # # #         while (e < n and s < n):
# # # # # # # # # # # # # # # # #             if word[e] == '1':
# # # # # # # # # # # # # # # # #                 e += 1
# # # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # # #                 temp = word[s: e]
# # # # # # # # # # # # # # # # #                 if temp not in lst:
# # # # # # # # # # # # # # # # #                     lst[temp] = 1
# # # # # # # # # # # # # # # # #                 else:
# # # # # # # # # # # # # # # # #                     lst[temp] += 1
                
# # # # # # # # # # # # # # # # #                 s = e
# # # # # # # # # # # # # # # # #                 e = s + 1
            
# # # # # # # # # # # # # # # # #         temp = word[s: e]
# # # # # # # # # # # # # # # # #         if '0' not in temp and temp not in lst:
# # # # # # # # # # # # # # # # #             lst[temp] = 1
# # # # # # # # # # # # # # # # #         elif temp in lst:
# # # # # # # # # # # # # # # # #             lst[temp] += 1

# # # # # # # # # # # # # # # # #         print(lst)
# # # # # # # # # # # # # # # # #         # for key, val in lst.items():
# # # # # # # # # # # # # # # # #         #     ans += self.helper(key) * val
        
# # # # # # # # # # # # # # # # #         # return int(ans)

# # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # solution.numSub("0110111")


# # # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # # #     def findSubSeq(self, word, p, ans, dp):
# # # # # # # # # # # # # # # # #         if not word:
# # # # # # # # # # # # # # # # #             ans.add(p)
# # # # # # # # # # # # # # # # #             return ans

# # # # # # # # # # # # # # # # #         if (word, p) in dp:
# # # # # # # # # # # # # # # # #             return dp[(word, p)]

# # # # # # # # # # # # # # # # #         ch = word[0]
# # # # # # # # # # # # # # # # #         ans.add(p + ch)

# # # # # # # # # # # # # # # # #         inc = self.findSubSeq(word[1:], p + ch, ans, dp)
# # # # # # # # # # # # # # # # #         exc = self.findSubSeq(word[1:], p, ans, dp)

# # # # # # # # # # # # # # # # #         dp[(word, p)] = ans.copy()

# # # # # # # # # # # # # # # # #         return ans

# # # # # # # # # # # # # # # # #     def distinctSubseqII(self, s: str) -> int:
# # # # # # # # # # # # # # # # #         dp = {}

# # # # # # # # # # # # # # # # #         subSeq = self.findSubSeq(s, "", set(), dp)

# # # # # # # # # # # # # # # # #         return len(subSeq) % (pow(10, 9) + 7) - 1

# # # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # # print(solution.distinctSubseqII("aaa"))

# # # # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # # # #     def distinctSubseqII(self, s: str) -> int:
# # # # # # # # # # # # # # # #         visited = [-1] * 27
# # # # # # # # # # # # # # # #         visited[0] = 1
# # # # # # # # # # # # # # # #         ans = 1

# # # # # # # # # # # # # # # #         for ch in s:
# # # # # # # # # # # # # # # #             index = ord(ch) - ord('a') + 1
# # # # # # # # # # # # # # # #             if visited[index] != -1:
# # # # # # # # # # # # # # # #                 ans = (2 * ans - visited[index - 1]) % (10**9 + 7)
# # # # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # # # #                 ans = (2 * ans) % (10**9 + 7)
# # # # # # # # # # # # # # # #             visited[index] = ans

# # # # # # # # # # # # # # # #         return (ans - 1) % (10**9 + 7)

# # # # # # # # # # # # # # # # # Example usage
# # # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # # result = solution.distinctSubseqII("aaa")
# # # # # # # # # # # # # # # # print(result)

# # # # # # # # # # # # # # # class Solution: 
# # # # # # # # # # # # # # #     def helper(self, ch, s):
# # # # # # # # # # # # # # #         i1 = s.index(ch)
# # # # # # # # # # # # # # #         i2 = s.rfind(ch)

# # # # # # # # # # # # # # #         return [i1, i2]

# # # # # # # # # # # # # # #     def countPalindromicSubsequence(self, s: str) -> int:
# # # # # # # # # # # # # # #         chars = set(s)
# # # # # # # # # # # # # # #         ans = 0

# # # # # # # # # # # # # # #         for ch in chars:
# # # # # # # # # # # # # # #             index = self.helper(ch, s)
# # # # # # # # # # # # # # #             if index[0] != index[1]:
# # # # # # # # # # # # # # #                 ans += len(set(s[index[0] + 1: index[1]]))
        
# # # # # # # # # # # # # # #         return ans

# # # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # # print(solution.countPalindromicSubsequence("aabca"))

# # # # # # # # # # # # # # from typing import List

# # # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # # #     def isPossible(self, weights, mid, days):
# # # # # # # # # # # # # #         sum = 0
# # # # # # # # # # # # # #         day = 1

# # # # # # # # # # # # # #         for weight in weights:
# # # # # # # # # # # # # #             if sum + weight <= mid:
# # # # # # # # # # # # # #                 sum += weight
# # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # #                 day += 1
# # # # # # # # # # # # # #                 if day > days or mid < weight:
# # # # # # # # # # # # # #                     return False
# # # # # # # # # # # # # #                 sum = weight
# # # # # # # # # # # # # #         return True

# # # # # # # # # # # # # #     def shipWithinDays(self, weights: List[int], days: int) -> int:
# # # # # # # # # # # # # #         s = 0
# # # # # # # # # # # # # #         e = 0
# # # # # # # # # # # # # #         ans = 0

# # # # # # # # # # # # # #         for weight in weights:
# # # # # # # # # # # # # #             e += weight
        
# # # # # # # # # # # # # #         while (s <= e):
# # # # # # # # # # # # # #             mid = s + (e - s) // 2

# # # # # # # # # # # # # #             if self.isPossible(weights, mid, days):
# # # # # # # # # # # # # #                 ans = mid
# # # # # # # # # # # # # #                 e = mid - 1
# # # # # # # # # # # # # #             else:
# # # # # # # # # # # # # #                 s = mid + 1
        
# # # # # # # # # # # # # #         return ans

# # # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # # print(solution.shipWithinDays([1,2,3,4,5,6,7,8,9,10], 5))

# # # # # # # # # # # # # from typing import List


# # # # # # # # # # # # # class Solution:
# # # # # # # # # # # # #     def maximumElementAfterDecrementingAndRearranging(self, arr: List[int]) -> int:
# # # # # # # # # # # # #         n = len(arr)
# # # # # # # # # # # # #         arr.sort()

# # # # # # # # # # # # #         if arr[0] != 1 and 1 in arr:
# # # # # # # # # # # # #             i = arr.index(1)
# # # # # # # # # # # # #             arr[0], arr[i] = arr[i], arr[0]
# # # # # # # # # # # # #         else:
# # # # # # # # # # # # #             arr[0] = 1
        
# # # # # # # # # # # # #         for i in range(1, n):
# # # # # # # # # # # # #             if abs(arr[i] - arr[i - 1]) > 1:
# # # # # # # # # # # # #                 arr[i] = arr[i - 1] + 1
        
# # # # # # # # # # # # #         return max(arr)


# # # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # # print(solution.maximumElementAfterDecrementingAndRearranging([73,98,9]))

# # # # # # # # # # # # class Solution:
# # # # # # # # # # # #     def countPrimes(self, n: int) -> int:
# # # # # # # # # # # #         table = [True] * (n + 1)
# # # # # # # # # # # #         table[0] = table[1] = False
        
# # # # # # # # # # # #         count = 0

# # # # # # # # # # # #         for i in range(2, n):
# # # # # # # # # # # #             if table[i]:
# # # # # # # # # # # #                 count += 1
                
# # # # # # # # # # # #                 j = 2 * i
# # # # # # # # # # # #                 while (j <= n):
# # # # # # # # # # # #                     table[j] = False
# # # # # # # # # # # #                     j += i
        
# # # # # # # # # # # #         return count
    
# # # # # # # # # # # # solution = Solution()
# # # # # # # # # # # # print(solution.countPrimes(10))


# # # # # # # # # # # def gcd(a, b): 
# # # # # # # # # # #     if a == 0: 
# # # # # # # # # # #         return b 
  
# # # # # # # # # # #     return gcd(b % a, a)

# # # # # # # # # # # print(gcd(72, 24))

# # # # # # # # # # import math
# # # # # # # # # # from typing import List


# # # # # # # # # # class Solution:
# # # # # # # # # #     def Pow(self, a, n, dp):
# # # # # # # # # #         # BASE CASE:-
# # # # # # # # # #         if n == 0:
# # # # # # # # # #             return 1
        
# # # # # # # # # #         if dp[n] != -1:
# # # # # # # # # #             return dp[n]

# # # # # # # # # #         if n % 2 == 1:
# # # # # # # # # #             res = self.Pow(a, n // 2, dp) * self.Pow(a, n // 2, dp)
# # # # # # # # # #             dp[n] = res * a
# # # # # # # # # #             return dp[n]
# # # # # # # # # #         else:
# # # # # # # # # #             dp[n] = self.Pow(a, n // 2, dp) * self.Pow(a, n // 2, dp)
# # # # # # # # # #             return dp[n]


# # # # # # # # # #     def superPow(self, a: int, b: List[int]) -> int:
# # # # # # # # # #         n = ""
# # # # # # # # # #         for i in b:
# # # # # # # # # #             n += str(i)
# # # # # # # # # #         n = int(n)

# # # # # # # # # #         dp = [-1] * (n + 1)

# # # # # # # # # #         return self.Pow(a, n, dp)

# # # # # # # # # # solution = Solution()
# # # # # # # # # # print(solution.superPow(10, [1, 0]))
# # # # # # # # # from typing import List

# # # # # # # # # class Solution:
# # # # # # # # #     def toBinary(self, num, l):
# # # # # # # # #         ans = ""
# # # # # # # # #         if num == 0:
# # # # # # # # #             for i in range(l):
# # # # # # # # #                 ans += "0"            
        
# # # # # # # # #         while(num > 0):
# # # # # # # # #             d = num % 2
# # # # # # # # #             ans = str(d) + ans
# # # # # # # # #             num = num // 2
        
# # # # # # # # #         for i in range(l - len(ans)):
# # # # # # # # #             ans = "0" + ans

# # # # # # # # #         return ans

# # # # # # # # #     def findDifferentBinaryString(self, nums: List[str]) -> str:
# # # # # # # # #         n = len(nums)
# # # # # # # # #         arr = set()

# # # # # # # # #         for binary in nums:
# # # # # # # # #             arr.add(int(binary, 2))
# # # # # # # # #         print(arr)
        
# # # # # # # # #         for i in range(0, len(nums) + 1):
# # # # # # # # #             if i not in arr:
# # # # # # # # #                 return self.toBinary(i, n)
        
# # # # # # # # #         return "0"

# # # # # # # # # solution = Solution()
# # # # # # # # # print(solution.toBinary(1, 2))
# # # # # # # # # print(solution.findDifferentBinaryString(["00","01"]))
# # # # # # # # from typing import List

# # # # # # # # class Solution:
# # # # # # # #     def threeSum(self, nums: List[int]) -> List[List[int]]:
# # # # # # # #         n = len(nums)
# # # # # # # #         ans = set()
# # # # # # # #         count = {}

# # # # # # # #         for i in nums:
# # # # # # # #             if i not in count:
# # # # # # # #                 count[i] = 1
# # # # # # # #             else:
# # # # # # # #                 count[i] += 1
        
# # # # # # # #         for i in range(n):
# # # # # # # #             n1 = nums[i]
# # # # # # # #             count[n1] -= 1
# # # # # # # #             for j in range(i + 1, n):
# # # # # # # #                 n2 = nums[j]
# # # # # # # #                 count[n2] -= 1

# # # # # # # #                 n3 = -1 * (n1 + n2)
                
# # # # # # # #                 if n3 in count and count[n3] > 0:
# # # # # # # #                     lst = list([n1, n2, n3])
# # # # # # # #                     lst.sort()
# # # # # # # #                     ans.add(lst)
                
# # # # # # # #                 count[n2] += 1
# # # # # # # #             count[n1] += 1
        
# # # # # # # #         return ans

# # # # # # # # solution = Solution()
# # # # # # # # print(solution.threeSum([-1,0,1,2,-1,-4]))         

# # # # # # # from typing import List


# # # # # # # class Solution:
# # # # # # #     def trap(self, arr: List[int]) -> int:
# # # # # # #         n = len(arr)
# # # # # # #         lMax = [0] * n
# # # # # # #         rMax = [0] * n

# # # # # # #         tMax = 0

# # # # # # #         for i in range(n):
# # # # # # #             if arr[i] > tMax:
# # # # # # #                 tMax = arr[i]
# # # # # # #             lMax[i] = tMax
        
# # # # # # #         tMax = 0

# # # # # # #         for i in range(n - 1, -1, -1):
# # # # # # #             if arr[i] > tMax:
# # # # # # #                 tMax = arr[i]
# # # # # # #             rMax[n - 1 - i] = tMax
        
# # # # # # #         print(lMax)
# # # # # # #         print(rMax)
        
# # # # # # #         ans = 0

# # # # # # #         for i in range(n):
# # # # # # #             ans += (min(lMax[i], rMax[i]) - arr[i])
        
# # # # # # #         return ans

# # # # # # # solution = Solution()
# # # # # # # print(solution.trap([0,1,0,2,1,0,1,3,2,1,2,1]))

# # # # # # arr = [5, 3, 6, 8, 1, 4]
# # # # # # arr.sort()
# # # # # # arr.reverse()

# # # # # # print(arr)


# # # # # from typing import List

# # # # # class Solution:
# # # # #     def isPossible(self, arr, k, mid):
# # # # #         count = 0
# # # # #         n = -1  
# # # # #         for i in range(len(arr)):
# # # # #             if arr[i] > mid:
# # # # #                 break
# # # # #             n = i

# # # # #         for i in range(n + 1):  
# # # # #             count += 1
# # # # #             k -= (mid - arr[i])
# # # # #             if k <= 0:
# # # # #                 break

# # # # #         return count >= n + 1  

# # # # #     def maxFrequency(self, arr: List[int], k: int) -> int:
# # # # #         arr.sort()
# # # # #         ans = 0
# # # # #         s = min(arr)
# # # # #         e = max(arr)

# # # # #         while s <= e:
# # # # #             mid =  (s + e) // 2

# # # # #             if self.isPossible(arr, k, mid):  
# # # # #                 s = mid + 1
# # # # #                 ans = mid
# # # # #             else:
# # # # #                 e = mid - 1
        
# # # # #         return ans

# # # # # solution = Solution()
# # # # # result = solution.maxFrequency([3,9,6], 2)
# # # # # print(result)


# # # # # nums = [1, 3, 5]

# # # # # position = [0] * (len(nums) - 1)

# # # # # for i in range(1, len(nums)):
# # # # #     position[i - 1] = nums.index(nums[i])

# # # # # print(position)

# # # # from typing import List

# # # # # class Solution:
# # # # #     def reductionOperations(self, arr: List[int]) -> int:
# # # # #         arr.sort()
# # # # #         n = len(arr)
# # # # #         nums = list(set(arr))
# # # # #         position = [0] * (len(nums) - 1)

# # # # #         for i in range(1, len(nums)):
# # # # #             position[i - 1] = arr.index(nums[i])

# # # # #         ans = 0

# # # # #         for i in position:
# # # # #             ans += n - i

# # # # #         return ans

# # # # # solution = Solution()
# # # # # print(solution.reductionOperations([5,1,3]))

# # # # # class Solution:
# # # # #     def helper(self, a, n):
# # # # #         # BASE CASE:
# # # # #         if n == 1:
# # # # #             return a
        
# # # # #         if (n & 1) == 1:
# # # # #             return a * self.helper(a * a, (n - 1) // 2)
# # # # #         else:
# # # # #             return self.helper(a * a, n // 2)


# # # # #     def superPow(self, a: int, b: List[int]) -> int:
# # # # #         n = ""
# # # # #         for i in b:
# # # # #             n += str(i)
# # # # #         n = int(n)
# # # # #         print(n&1)

# # # # #         if a == 1 or n == 0:
# # # # #             return 1
# # # # #         base = a
# # # # #         return self.helper(a, n)

# # # # # solution = Solution()
# # # # # print(solution.helper(2, 10))

# # # # class Solution:
# # # #     def rev(self, num):
# # # #         ans = 0

# # # #         while(num > 0):
# # # #             ans *= 10
# # # #             l = num % 10
# # # #             ans += l
# # # #             num = num // 10

# # # #         return ans 

# # # #     def countNicePairs(self, nums: List[int]) -> int:
# # # #         m = (10 ** 9) + 7
# # # #         ans = 0
# # # #         n = len(nums)
# # # #         count = {}

# # # #         for i in range(n):
# # # #             nums[i] = nums[i] - self.rev(nums[i])
# # # #             if nums[i] in count:
# # # #                 count[nums[i]] += 1
# # # #             else:
# # # #                 count[nums[i]] = 1
# # # #         print(nums)
# # # #         print(count)
        
# # # #         for i in count.values():
# # # #             if i == 1:
# # # #                 continue
# # # #             elif i == 2:
# # # #                 ans += 1
# # # #             else:
# # # #                 ans += ((i - 1) * (i)) >> 1
        
# # # #         return ans % m

    

    
# # # # solution = Solution()
# # # # print(solution.countNicePairs([13,10,35,24,76]))

# # # from typing import List

# # # class Solution:
# # #     def findDiagonalOrder(self, nums: List[List[int]]) -> List[int]:
# # #         lst = []
# # #         if not nums:
# # #             return []

# # #         for r in range(len(nums)):
# # #             for c in range(len(nums[r])):
# # #                 s = (r + c)
# # #                 lst.append([s, r, nums[r][c]])
        
# # #         lst.sort(key=lambda x: (x[0], -x[1]))
# # #         ans = [0] *  len(lst)

# # #         for i in range(len(lst)):
# # #             ans[i] = lst[i][2]
        
# # #         return ans


# # # solution = Solution()
# # # print(solution.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
# # from typing import List

# # class Solution:

# #     def findDiagonalOrder(self, nums: List[List[int]]) -> List[int]:
# #         lst = []
# #         if not nums:
# #             return []

# #         for r in range(len(nums)):
# #             for c in range(len(nums[r])):
# #                 s = (r + c)
# #                 lst.append([s, r, c, nums[r][c]])
        
# #         lst.sort(key=lambda x: (x[0], x[1]) if s % 2 == 1 else (x[0], -x[1]))
# #         ans = [0] *  len(lst)

# #         for i in range(len(lst)):
# #             ans[i] = lst[i][3]
        
# #         return ans

# # solution = Solution()
# # print(solution.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))

# class Solution:
#     def helper(self, possibility, n, dp, cell):
#         if n == 0:
#             return 1
        
#         if dp[n, cell] != -1:
#             return dp[n, cell]
        
#         ans = 0

#         for i in possibility[cell]:
#             ans += self.helper(possibility, n - 1, dp, i)

#         dp[n][cell] = ans
#         return ans

#     def knightDialer(self, n: int) -> int:
#         possibility = [
#             [4, 6],
#             [6, 8],
#             [7, 9],
#             [4, 8],
#             [3, 9, 0],
#             [],
#             [1, 7, 0],
#             [2, 6],
#             [1, 3],
#             [2, 4]
#         ]

#         dp = [[-1] * 5001] * 10

from typing import List

class Solution:
    def maxProduct(self, words: List[str]) -> int:
        ans = 0
        for i in range(len(words)):
            for j in range(i + 1, len(words)):
                w1 = set(words[i])
                w2 = set(words[j])

                if w1&w2 == set() and len(w1) * len(w2) > ans:
                    ans = len(w1) * len(w2)
        
        return ans
solution = Solution()
print(solution.maxProduct(["abcw","baz","foo","bar","xtfn","abcdef"]))