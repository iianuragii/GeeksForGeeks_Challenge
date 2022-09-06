//User function Template for Java

class Solution { 
    long findMinSum(int[] A,int[] B,int N) 
    { 
               Arrays.sort(A);
        Arrays.sort(B);
        long answer=0;
        for(int i=0;i<N;i++)
        {
            answer+=Math.abs(A[i]-B[i]);
        }
        return answer;
    }
}
