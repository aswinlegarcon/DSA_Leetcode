class Solution:
    def closestDivisors(self, num: int) -> List[int]:
        closediff = float("inf")
        ans = [0, 0]

        def solve(n):
            nonlocal closediff
            i = 1
            while(i*i<=n):
                if n%i==0:
                    if abs(i-n//i) < closediff:
                        closediff = abs(i-n//i)
                        ans[0] = i
                        ans[1] = n//i
                i+=1

        solve(num+1)
        solve(num+2)
        return ans