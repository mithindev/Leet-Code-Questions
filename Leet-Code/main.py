from typing import List

def index(arr, target, l):
    ans = ""
    for i in range(len):
        if arr[i] == target:
            ans += str(i)
    return ans
     

def distance(nums: List[int]) -> List[int]:
        l = len(nums)
        dict = {}
        for i in set(nums):
            dict[i] = index(nums, )

        for i in range(l):
            temp = nums[i]
            lst = nums.index(temp)


# lst = [1, 1, 2, 3, 1, 1, 3]
# print(lst.index(1, 0, len(lst)))