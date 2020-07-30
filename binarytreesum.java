package DFS;

public class binarytreesum {
    public static boolean order(Tree root,int sum)
    {
        if(root==null)
        {
            return false;
        }
        if(root.v==sum&& root.left==null && root.right==null)
        {
            return true;
        }
        return order(root.left, sum-root.v)||order(root.right, sum-root.v);
        
    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root,320));
    }
}