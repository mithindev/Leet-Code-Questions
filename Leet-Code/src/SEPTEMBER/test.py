class Solution:
    def count(self, n, num):
        count = 0

        for i in num:
            if i == n:
                count += 1
        
        return count
    
    def countAndSay(self, n: int) -> str:
        set_n = set(str(n))

        ans = ""

        num_to_word = {'1': 'one', '2': 'two', '3': 'three', '4': 'four', '5': 'five', '6': 'six', '7':'seven', '8': 'eight', '9': 'nine', '0': 'zero'}

        t = 0
        for i in set_n:
            temp = self.count(i, str(n))

            if t != len(set_n) - 1:  
                ans += num_to_word[i] + ' ' + str(temp) + "'s "
            else:
                ans += 'and ' + num_to_word[i] + ' ' + str(temp) + "'s"
            
            t += 1

        return ans

# Example usage:
solution = Solution()
result = solution.countAndSay(112233)
print(result)