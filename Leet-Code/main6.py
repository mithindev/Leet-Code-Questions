from typing import List


class Solution:
    def helper(self, coins, amount):
        # BASE CASE
        if amount == 0:
            return 0
        if amount < 0:
            return 10000000
        
        minimum = 10000000

        for i in coins:
            ans = self.helper(coins, amount - i)
            if ans != 10000000:
                minimum = min(minimum, ans + 1)
        
        return minimum  

    def coinChange(self, coins: List[int], amount: int) -> int:
        
        return self.helper(coins, amount)


solution = Solution()
print(solution.coinChange([1, 2, 5], 11))