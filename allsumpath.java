package DFS;

import java.util.*;

public class allsumpath {
    public static List<List<Integer>> order(Tree root,int sum) {
        List<List<Integer>>li= new ArrayList<>();
        List<Integer>x=new ArrayList<>();
        printall(root,li,x,sum);
        return li;
        
        
    }
    public static void printall(Tree root,List<List<Integer>>li,List<Integer>x,int sum)
    {
        if(root==null)
        {
            return ;
        }
        x.add(root.v);
        if(root.v==sum &&root.left==null && root.right==null)
        {
            li.add(new ArrayList<>(x));
        }
        else
        {
            printall(root.left, li, x,sum-root.v);
            printall(root.right, li, x,sum-root.v);
        }
        x.remove(x.size()-1);

    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root,30));
    }
}