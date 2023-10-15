# from typing import List


# def intersect(nums1: List[int], nums2: List[int]) -> List[int]:
#         ans = []

#         for i in nums1:
#             if i in nums2:
#                 ans.append(i)
#                 nums1.remove(i)
#                 nums2.remove(i)
        
#         return ans

# print(intersect([1,2,2,1], [2,2]))

# a1 = [2,2]
# a1.remove(2)

# print(a1)

from typing import List

def buildArray(target: List[int], n: int) -> List[str]:
        stack = [1]
        stream = [i for i in range(1, n + 1)]
        ans = ["Push"]

        pt = 0
        ps = 1

        while (stack is not target):
            while (stack[len(stack) - 1] != target[pt]):
                stack.pop()
                ans.append("Pop")
                stack.append(stream[ps])
                ans.append("Push")
                ps += 1
            while (ps < n and stack[len(stack) - 1] == target[pt]):
                ps += 1
                stack.append(stream[ps])
                ans.append("Push")
                pt += 1 
            
        return ans

print(buildArray([1,2,3], 3))