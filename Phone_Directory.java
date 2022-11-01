//User function Template for Java
//Hard

class Solution{

    public static boolean isSame (String pattern, String Str) {

        int i=0,j=0, N = pattern.length(), M =Str.length(); 

        while(i< N && j < M){

            if(pattern.charAt(i) != Str.charAt(j)){

                return false;

            }

            i++;

            j++;

        }

        if( i < N && j== M ) return false;

        return true;

    }

    static ArrayList<ArrayList<String>> displayContacts(int n, 

                                        String contact[], String s)

    {

        ArrayList<String> arr= new ArrayList<>();

        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        Set<String> hs = new HashSet<>();

        for(int i=0; i<n; i++) hs.add(contact[i]);

        String Str = "";

        for(int i=0; i< s.length(); i++) {

            Str = Str + s.charAt(i);

            arr.add(Str);

        }

        

        // System.out.println(arr);

        for(int i=0; i< arr.size(); i++){

            String pattern = arr.get(i);

            ArrayList<String> sublist = new ArrayList<>();

            for(String S : hs){

                // String S = contact[j];

                // if( S.contains(pattern)) sublist.add(S);

                if(isSame(pattern, S)) sublist.add(S);

            }

            if(sublist.size() == 0)  sublist.add("0");

            Collections.sort(sublist);

            ans.add(sublist);

        }

        return ans;

    }

}
