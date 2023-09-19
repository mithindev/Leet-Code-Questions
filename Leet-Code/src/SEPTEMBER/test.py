from typing import List

# def continuousSubarrays(arr: List[int]) -> int:
#         l = len(arr)
#         if (l == 0 or l == 1):
#             return 0
        
#         outer = []

#         for i in range(l):
#             s = 0
#             e = s + i

#             while (e < l):
#                 inner = arr[s: e + 1]
#                 s += 1
#                 e += 1
#                 outer.append(inner)
            
            
        
#         return len(outer)

def continuousSubarrays(arr: List[int]) -> int:
        l = len(arr)
        if (l == 0 or l == 1):
            return 0
        
        count = 0  # Initialize the count of continuous subarrays

        for i in range(l):
            for j in range(i, l):
                count += 1  # Increment count for each continuous subarray
            
        return count

lst = [5, 4, 2, 4]
        
print(continuousSubarrays(lst))