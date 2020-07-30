package DFS;

public class diameter {
    static int d=0;
    public static int  order(Tree root) {
        height(root);
        return d;
    }
    public static int height(Tree root) {

        if(root==null)
        {
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        int dia=l+r+1;
        d=Math.max(d,dia);
        return Math.max(l,r)+1;

    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root));
    }
}