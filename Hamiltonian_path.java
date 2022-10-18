ArrayList<Integer> al[]=new ArrayList[N+1];
      
      for(int i=0;i<N+1;i++)
          al[i]=new ArrayList<>();
      
      for(ArrayList<Integer> ed:Edges)
      {
          int src=ed.get(0);
          int des=ed.get(1);
          al[src].add(des);
          al[des].add(src);
      }
      Set<Integer> st=new HashSet<>();
    
     for(int i=1;i<=N;i++)
     {
     if(find(al,i,st))
     return true;
     }
      return false;
   }
   public static boolean find(ArrayList<Integer> al[],int src,Set<Integer> st)
   {
               st.add(src);
       if(st.size()==al.length-1)
       return true;

       for(Integer ele:al[src])
       {
           if(!st.contains(ele))
           {
               if(find(al,ele,st))
               return true;
           }
       }
       st.remove(src);
       return false;
   }
}
