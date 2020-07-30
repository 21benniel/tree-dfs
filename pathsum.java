package DFS;

public class pathsum {
    public static int  order(Tree root) {
        return pathsum1(root,0);
    }

    public static int pathsum1(Tree root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        sum=10*sum+root.v;
        if(root.left==null && root.right==null)
        {
            return sum;
        }
        return pathsum1(root.left, sum)+pathsum1(root.right, sum);
    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root));
    }
}