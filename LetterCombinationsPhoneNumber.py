class Solution:
    def letterCombinations(self, digits):
        """
            :type digits: str
            :rtype: List[str]
            """
        numbs = {'2':'abc', '3':'def', '4':'ghi', '5':'jkl', '6':'mno', '7':'pqrs', '8':'tuv', '9':'wxyz'}
        
        if(len(digits) == 0):
            return []
        
        if(len(digits) == 1):
            lst = []
            for c in numbs[digits[0]]:
                lst.append(c)
            return lst
        else:
            rest = self.letterCombinations(digits[1:])
            l = []
            for c in numbs[digits[0]]:
                for c2 in rest:
                    l.append(c + c2)
            return l
