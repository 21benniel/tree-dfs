package DFS;



public class patternpath {
    public static boolean order(Tree root,int arr[]) {
        if(root==null)
        {
            return arr.length==0;
        }
        return pattern(root,arr,0);
    }
    public static boolean pattern(Tree root,int arr[],int index) {
        if(root==null)
        {
            return false;
        }
        if(index>=arr.length||arr[index]!=root.v )
        {
            return false;
        }
        if(root.left==null && root.right==null && index==arr.length-1)
        {
            return true;
        }
        return pattern(root.left, arr, index+1)||pattern(root.right, arr, index+1);
        
    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        int arr[]={20,40,50,60};
        System.out.println(order(n.root,arr));
    }
}