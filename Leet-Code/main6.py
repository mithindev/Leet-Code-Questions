# from typing import List


# class Solution:
#     def helper(self, coins, amount):
#         # BASE CASE
#         if amount == 0:
#             return 0
#         if amount < 0:
#             return 10000000
        
#         minimum = 10000000

#         for i in coins:
#             ans = self.helper(coins, amount - i)
#             if ans != 10000000:
#                 minimum = min(minimum, ans + 1)
        
#         return minimum  

#     def coinChange(self, coins: List[int], amount: int) -> int:
        
#         return self.helper(coins, amount)


# solution = Solution()
# print(solution.coinChange([1, 2, 5], 11))


# class Solution:
#     def helper(self, n, row):
#         ans = row

#         # BASE CASE
#         if n == 0:
#             return ans

#         for i in row:
#             if i == '0':
#                 ans += '1'
#             else:
#                 ans += '0'
        
#         return self.helper(n - 1, ans)
    
#     def kthGrammar(self, n: int, k: int) -> int:
#         ans = self.helper(n, '0')

#         return int(ans[k])

# solution = Solution()
# print(solution.kthGrammar(1, '0'))


class Solution:
    def helper(self, n, row):
        ans = row

        # BASE CASE
        if n == 0:
            return ans

        for i in row:
            if i == '0':
                ans += '1'
            else:
                ans += '0'
        
        return self.helper(n - 1, ans)
    
    def kthGrammar(self, n: int, k: int) -> int:
        #BASE CASE
        if n == 0 or k == 1:
            return 0

        mid = pow(2, n - 1) // 2

        ans = 0

        if k <= mid:
            ans = self.kthGrammar(n - 1, k)
        else:
            ans = 1 ^ self.kthGrammar(n - 1, k - mid)

        return ans 



solution = Solution()
n = 2
k = 2
result = solution.kthGrammar(n, k)
print(result)
