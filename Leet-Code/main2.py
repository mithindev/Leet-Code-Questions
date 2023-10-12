# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
# # class MountainArray:
# #     def get(self, index: int) -> int:
# #     def length(self) -> int:

# class Solution:
#     def peakIndexInMountainArray(self, arr: 'MountainArray') -> int:
#         s = 0
#         e = arr.length() - 1

#         while s <= e:
#             mid = s + (e - s) // 2

#             if arr.get(mid) > arr.get(mid - 1) and arr.get(mid) > arr.get(mid + 1):
#                 return mid
#             elif arr.get(mid) < arr.get(mid + 1):
#                 s = mid + 1
#             else:
#                 e = mid - 1

#     def search1(self, arr: 'MountainArray', st, l, target):
#         s = st
#         e = l

#         while s <= e:
#             mid = s + (e - s) // 2  

#             if arr.get(mid) == target:
#                 return mid
#             elif target > arr.get(mid):
#                 s = mid + 1
#             else:
#                 e = mid - 1

#         return -1

#     def search2(self, arr: 'MountainArray', st, l, target):
#         s = st
#         e = l

#         while s <= e:
#             mid = s + (e - s) // 2  

#             if arr.get(mid) == target:
#                 return mid
#             elif target < arr.get(mid):
#                 s = mid + 1
#             else:
#                 e = mid - 1

#         return -1


#     def findInMountainArray(self, target: int, arr: 'MountainArray') -> int:
#         peak = self.peakIndexInMountainArray(arr)

#         result = self.search1(arr, 0, peak, target)
#         if result != -1:
#             return result

#         result = self.search2(arr, peak + 1, arr.length() - 1, target)
#         return result

# # Creating a MountainArray object with the given values
# class MountainArray:
#     def __init__(self, array):
#         self.array = array

#     def get(self, index: int) -> int:
#         return self.array[index]

#     def length(self) -> int:
#         return len(self.array)

# # Example usage
# if __name__ == "__main__":
#     solution = Solution()
#     mountain_array = MountainArray([3,5,3,2,0])
#     result = solution.findInMountainArray(0, mountain_array)
#     print(result)

#     print(solution.peakIndexInMountainArray(mountain_array))

from typing import List


def peakIndexInMountainArray(arr: List[int]) -> int:
        s = 0
        e = len(arr) - 1

        while s <= e:
            mid = s + (e - s) // 2

            if arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1]:
                return mid
            elif arr[mid] < arr[mid + 1]:
                s = mid + 1
            else:
                e = mid - 1
        
        return -1

def validMountainArray(arr: List[int]) -> bool:
        if len(arr) < 3:
            return False
        
        if len(arr) == 3:
            return arr[1] > arr[0] and arr[1] < arr[2]
        
        return peakIndexInMountainArray(arr) != -1

print(validMountainArray([1,3,2]))