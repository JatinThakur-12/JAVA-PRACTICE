public class test {
    static class Node{
        String str;
        Node left;
        Node right;
        Node(String str){
            this.str=str;
            this.left=null;
            this.right=null;
        }
    }
    public static Node buildtree(Node root){
        
        int n=root.str.length();
        if(n==1){
            return new Node(root.str);
        }
        Node left=new Node(root.str.substring(0,n/2));
        Node right=new Node(root.str.substring(n/2));
        root.left=buildtree(left);
        root.right=buildtree(right);
        return root;
    }
    public static Node findscramble(Node root){
        return root;
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.str+" ");
        inorder(root.right);
    }
    public static boolean isScramble(String S1,String S2)
    {
        //code here
        Node root=new Node(S2);
        root=buildtree(root);
        inorder(root);
        findscramble(root);
        return true;
    }
        // Driver code
    public static void main(String[] args)
    {
        
        
        // Function call
        isScramble("coder","ocder");
    }
    
}
