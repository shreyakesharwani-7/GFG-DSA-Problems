from collections import Counter 
class Solution:
    def isSubset(self,a,b):
        count_a = Counter(a)
        count_b = Counter(b)
        for num in count_b:
            if count_a[num] < count_b[num]:
                return False
        return True