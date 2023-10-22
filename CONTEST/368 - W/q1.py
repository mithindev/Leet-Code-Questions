import sys
from typing import List

def minimumSum(nums: List[int]) -> int:
        ans = sys.maxsize
        
        for i in range(1, len(nums) - 1):
            if nums[i] > nums[i - 1] and nums[i] > nums[i + 1]:
                if nums[i - 1] + nums[i] + nums[i + 1] < ans:
                    ans = nums[i - 1] + nums[i] + nums[i + 1]
        
        return ans

print(minimumSum([5,4,8,7,10,2]))
