class Solution:
    def GCD(self, nums: List[int]) -> int:

        m = max(nums)
        n = min(nums)

        for i in (range(m, 0, -1)):
            if m % i == 0 and n % i ==0:
                return i
        
        return 1

    def smallestEvenMultiple(self, n: int) -> int:
        return (2 * n) // self.GCD([2, n])
        