package DFS;

public class maxsum {
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
        l=Math.max(l,0);
        r=Math.max(r,0);
        int s=l+r+root.v;
        d=Math.max(d,s);
        return Math.max(l,r)+root.v;

    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root));
    }
}