# def backspaceCompare(s: str, t: str) -> bool:
#         s1 = []
#         s2 = []

#         for i in s:
#             if i == '#' and s1:
#                 s1.pop()
#             else:
#                 s1.append(i)
        
#         for i in t:
#             if i == '#':
#                 if s2:
#                 s2.pop()
#             else:
#                 s2.append(i)
        
#         return s1 == s2

# print(backspaceCompare("y#fo##f", "y#f#o##f"))

def lengthOfLongestSubstring(word: str) -> int:
        ans = 0
        s = 0
        e = 0

        while e < len(word) - 1:
            substr = word[s:e + 1]
            ch = word[e + 1]

            if ch in substr:
                ans = max(ans, len(substr))
                s = e + 1
                e = e + 1

            e += 1

        return ans

print(lengthOfLongestSubstring("bbbbbbb"))