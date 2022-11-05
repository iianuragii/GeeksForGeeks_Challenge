#User function Template for python3

class Solution:
    def maxGroupSize(self, arr, N, K):
        # code here 
        a=[0]*K
        for r in arr:
            a[r%K]+=1
        ans=0
        for i in range(1,((K+1)//2)):
            ans+=max(a[i],a[K-i])
        if K&1==0 and a[K//2]!=0:
            ans+=1
        if a[0]!=0:
            ans+=1
        return ans
