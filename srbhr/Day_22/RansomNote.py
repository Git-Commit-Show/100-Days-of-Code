class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        return not any((Counter(ransomNote)-Counter(magazine)).values())
