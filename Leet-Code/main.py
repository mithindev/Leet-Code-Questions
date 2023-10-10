# from typing import List

# def index(arr, target, l):
#     ans = ""
#     for i in range(len):
#         if arr[i] == target:
#             ans += str(i)
#     return ans

# def solver(s, i):
#     ans = 0
#     for x in s:
#         ans += abs(int(x) - i)
#     return ans
     

# def distance(nums: List[int]) -> List[int]:
#     ans = []
#     l = len(nums)
#     dict = {}
#     for i in set(nums):
#         dict[i] = index(nums, i)

#     for i in range(l):
#         temp = nums[i]
#         indeces = dict[temp]
#         ans.append(solver(indeces, i))
#     return ans
        




# # lst = [1, 1, 2, 3, 1, 1, 3]
# # print(lst.index(1, 0, len(lst)))

import sys
from typing import List

def minOperations(arr: List[int]) -> int:

    l = len(arr)
    arr = list(set(arr))

    arr.sort()
    ans = -sys.maxsize - 1

    e = 0
    for s in range(l):
        while (e < len(arr) and arr[e] < arr[s] + l):
            e += 1
        
        sw = e - s
        ans = max(ans, sw)
    
    return l - ans


    # for i in arr:
    #     sw = 0
            
    #     if (i + l < arr[len(arr) - 1]):
    #         for j in range (i, i + l):
    #             if j in arr:
    #                 sw += 1

    #     if sw > ans:
    #         ans = sw
        
    # return l - ans
        

print(minOperations([4,2,5,3]))