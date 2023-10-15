from typing import List


def intersect(nums1: List[int], nums2: List[int]) -> List[int]:
        ans = []

        for i in nums1:
            if i in nums2:
                ans.append(i)
                nums1.remove(i)
                nums2.remove(i)
        
        return ans

print(intersect([1,2,2,1], [2,2]))

a1 = [2,2]
a1.remove(2)

print(a1)
