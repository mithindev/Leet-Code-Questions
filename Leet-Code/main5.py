# from typing import List

# def removeDuplicates(arr: List[int]) -> int:
#         if len(arr) <= 2:
#             return arr

#         s = 0
#         f = 0
#         count = 0

#         while f < len(arr):
#             while arr[s] == arr[f]:
#                 f += 1
#                 count += 1            

#             else:
#                 while s < len(arr) and count != 2:
#                      arr[s] = 'r'
#                      count -= 1
#                      s += 1

#                 if count == 2:
#                     s = f
#                     count = 0
        
#         return arr

# print(removeDuplicates([0,0,1,1,1,1,2,3,3, 3, 3]))

from typing import List
import sys

def removeDuplicates(arr: List[int]) -> int:
        if len(arr) <= 2:
            return len(arr)

        count = 1
        temp = len(arr)

        for i in range(1, len(arr)):
            if arr[i] == arr[i - 1]:
                count += 1
                if count >= 2:
                    arr[i] = 'r'
            else:
                count = 1
        
        arr = [x for x in arr if x != 'r']
        k = len(arr)

        for i in range(k, temp):
            arr.append(0)
        
        print(arr)
        
        return k

print(removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 3]))
