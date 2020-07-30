package DFS;

import java.util.*;

public class pathgsumany {
    public static int order(Tree root,int s)
    {
        List<Integer>li= new LinkedList<>();
        return path(root,li,s);

    }
    public static int  path(Tree root,List<Integer>li,int s) {

        if(root==null)
        {
            return 0;
        }
        li.add(root.v);
        int path=0,count=0;
        ListIterator<Integer>it=li.listIterator(li.size());
        while(it.hasPrevious())
        {
            path+=it.previous();
            if(path==s)
        {
            count++;
        }     
    } 
        path+=path(root.left,li,s);
        path+=path(root.right,li,s);

        li.remove(li.size()-1);
        return count;
        
    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root,320));
    }
}