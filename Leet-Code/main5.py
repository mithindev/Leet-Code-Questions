# # # # # # # # # from typing import List

# # # # # # # # # def removeDuplicates(arr: List[int]) -> int:
# # # # # # # # #         if len(arr) <= 2:
# # # # # # # # #             return arr

# # # # # # # # #         s = 0
# # # # # # # # #         f = 0
# # # # # # # # #         count = 0

# # # # # # # # #         while f < len(arr):
# # # # # # # # #             while arr[s] == arr[f]:
# # # # # # # # #                 f += 1
# # # # # # # # #                 count += 1            

# # # # # # # # #             else:
# # # # # # # # #                 while s < len(arr) and count != 2:
# # # # # # # # #                      arr[s] = 'r'
# # # # # # # # #                      count -= 1
# # # # # # # # #                      s += 1

# # # # # # # # #                 if count == 2:
# # # # # # # # #                     s = f
# # # # # # # # #                     count = 0
        
# # # # # # # # #         return arr

# # # # # # # # # print(removeDuplicates([0,0,1,1,1,1,2,3,3, 3, 3]))

# # # # # # # # from typing import List
# # # # # # # # import sys

# # # # # # # # def removeDuplicates(arr: List[int]) -> int:
# # # # # # # #         if len(arr) <= 2:
# # # # # # # #             return len(arr)

# # # # # # # #         count = 1
# # # # # # # #         temp = len(arr)

# # # # # # # #         for i in range(1, len(arr)):
# # # # # # # #             if arr[i] == arr[i - 1]:
# # # # # # # #                 count += 1
# # # # # # # #                 if count >= 2:
# # # # # # # #                     arr[i] = 'r'
# # # # # # # #             else:
# # # # # # # #                 count = 1
        
# # # # # # # #         arr = [x for x in arr if x != 'r']
# # # # # # # #         k = len(arr)

# # # # # # # #         for i in range(k, temp):
# # # # # # # #             arr.append(0)
        
# # # # # # # #         print(arr)
        
# # # # # # # #         return k

# # # # # # # # print(removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 3]))

# # # # # # # from typing import List

# # # # # # # def validateBinaryTreeNodes(n: int, leftChild: List[int], rightChild: List[int]) -> bool:
# # # # # # #         src = {}
# # # # # # #         parent = {}

# # # # # # #         for i in range (0, n):
# # # # # # #             src[i] = []
# # # # # # #             parent[i] = -1
        
# # # # # # #         for i in range (0, len(leftChild)):
# # # # # # #             src[i].append(leftChild[i])
# # # # # # #             src[i].append(rightChild[i])
        
# # # # # # #         for s in src:
# # # # # # #             for i in src[s]:
# # # # # # #                 if i == -1:
# # # # # # #                     continue
# # # # # # #                 if parent[i] == -1:
# # # # # # #                     parent[i] = s
# # # # # # #                 elif parent[i] != -1:
# # # # # # #                     return False
        
# # # # # # #         return True


# # # # # # # print(validateBinaryTreeNodes(4, [1, -1, 3, -1], [2,-1,-1,-1]))

# # # # # # from typing import List


# # # # # # def validateBinaryTreeNodes(n: int, leftChild: List[int], rightChild: List[int]) -> bool:
# # # # # #        if n == 1:
# # # # # #             return True

# # # # # #         parent = [-1] * n  # Initialize parent with -1 for all nodes

# # # # # #         for i in range(len(leftChild)):
# # # # # #             left, right = leftChild[i], rightChild[i]

# # # # # #             # Check if a node has more than one parent or if a node is its own parent
# # # # # #             if (left != -1 and parent[left] != -1) or (right != -1 and parent[right] != -1):
# # # # # #                 return False

# # # # # #             # Update the parent information
# # # # # #             if left != -1:
# # # # # #                 parent[left] = i
# # # # # #             if right != -1:
# # # # # #                 parent[right] = i

# # # # # #         # Check if there is exactly one root node
# # # # # #         root_count = parent.count(-1)
# # # # # #         return root_count == 1

# # # # # from typing import List


# # # # # def validateBinaryTreeNodes(n: int, leftChild: List[int], rightChild: List[int]) -> bool:
# # # # #         if n == 1:
# # # # #             return True
        
# # # # #         if set(leftChild) is {-1} or set(rightChild) is {-1}:
# # # # #             return False

# # # # #         parent = [-1] * n

# # # # #         for i in range (len(leftChild)):
# # # # #             left, right = leftChild[i], rightChild[i]

        
# # # # #             if (left != -1 and parent[left] != -1) or (right != -1 and parent[right] != -1):
# # # # #                 return False
            
# # # # #             if left != -1:
# # # # #                 parent[left] = i
# # # # #             if right != -1:
# # # # #                 parent[right] = i
        
# # # # #         ans = parent.count(-1)        
# # # # #         return ans == 1

# # # # # print(validateBinaryTreeNodes(4, [-1, 0], [-1,-1]))

# # # # def equalSubstring(s: str, t: str, maxCost: int) -> int:
# # # #         cost = []

# # # #         for i in range(len(s)):
# # # #             cost.append(abs(ord(s[i]) - ord(t[i])))
        
# # # #         print(cost)

# # # #         cost.sort()

# # # #         count = 0

# # # #         for i in cost:
# # # #             if maxCost - i >= 0:
# # # #                 maxCost -= i
# # # #                 count += 1
# # # #             else:
# # # #                 return count

# # # #         return count

# # # # print(equalSubstring("krrgw", "zjxss", 19))


# # # class Solution:
# # #     def solver (self, cost, n):
# # #         if n <= 1:
# # #             return cost[n]
        
# # #         return cost[n] + min (self.solver(cost, n - 1), (self.solver(cost, n - 2))

# # #     def minCostClimbingStairs(self, cost: List[int]) -> int:
        
# # #         n = len(cost)
 
# # #         return min(self.solver(cost, n - 1), (self.solver(cost, n - 2))
        

# # class Solution:
# #     def repeatedStringMatch(self, a: str, b: str) -> int:
# #         word = a
# #         count = 1

# #         if b in a:
# #             return count
# #         elif b in a + word:
# #             return count + 1
    
# #         while True:

# #             if len(a) < len(b):
# #                 a += word
# #                 count += 1
            
# #             else:
# #                 if b in a:
# #                     return count
# #                 elif len(a) < 2*len(b):
# #                     a += word
# #                     count += 1
# #                 else:
# #                     break
        
# #         return -1

# # solution = Solution()
# # print(solution.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab", "ba"))      
# from typing import List

# # class Solution:
# #     def threeSumClosest(self, arr: List[int], target: int) -> int:
# #         n = len(arr)
# #         arr.sort()
# #         ans = 0

# #         diff = 1000000

# #         for i in range(n - 2):
# #             s = i + 1
# #             e = n - 1

# #             temp = abs(arr[i] + arr[s] + arr[e] - target) if target > 0 else abs(target - (arr[i] + arr[s] + arr[e]))

# #             while(s < e):
# #                 if temp == 0:
# #                     return arr[i] + arr[s] + arr[e]
                
# #                 if temp < diff:
# #                     ans = arr[i] + arr[s] + arr[e]
                
# #                 s += 1
# #                 e -= 1

# #         return ans

from typing import List

class Solution:
    def threeSumClosest(self, arr: List[int], target: int) -> int:
        n = len(arr)
        arr.sort()
        ans = 0
        diff = float('inf') 

        for i in range(n - 2):
            s = i + 1
            e = n - 1

            while s < e:
                sum = arr[i] + arr[s] + arr[e]
                temp = abs(sum - target)

                if temp < diff:
                    diff = temp
                    ans = sum

                if sum < target:
                    s += 1
                else:
                    e -= 1

        return ans



# s = Solution()
# print(s.threeSumClosest([4,0,5,-5,3,3,0,-4,-5], -2))

class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        ans = float('inf')

        
    
s = Solution()
print(s.minimumSum([5,4,8,7,10,2]))