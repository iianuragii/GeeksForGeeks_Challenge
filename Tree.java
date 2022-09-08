//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Tree 
{
    int sum(Node root, int k) 
    { 
        this.p=k;
        func(root);
        
        return s;
    } 
    int s=0,p=0;
    void func(Node root)
    {
        if(root==null) return;
        func(root.left);
        if(p>0)
        {
            this.s+=root.data;
            p--;
        }
        func(root.right);
    }
}
