class Solution
{
    public static int isStackPermutation(int n, int[] ip, int[] op) 
    {
         Stack<Integer> sk = new Stack<>();
       int j=0;
       for(int i=0;i<n;i++)
       {
           sk.push(ip[i]);
           while(!sk.isEmpty() && sk.peek() == op[j])
           {
               sk.pop();
               j++;
           }
       }
       if(sk.isEmpty())
       {
           return 1;
       }
       return 0;
    }
}
