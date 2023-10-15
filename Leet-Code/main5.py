from typing import List

def buildArray(target: List[int], n: int) -> List[str]:
    stack = []
    ans = []

    pt = 0

    for i in range(1, n + 1):
        stack.append(i)
        ans.append("Push")
        if i != target[pt]:
            stack.pop()
            ans.append("Pop")
        else:
            pt += 1

        if pt == len(target):
            break

    return ans


print(buildArray([1,3], 3))