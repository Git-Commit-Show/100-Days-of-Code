from collections import Counter
class Solution:
    def firstUniqChar(self, s: str) -> int:
        count = Counter(s)
        unique_chars = {x for x,y in count.items() if y==1}
        for i in range(len(s)):
            if s[i] in unique_chars:
                return i
        else:
            return -1
