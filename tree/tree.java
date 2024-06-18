package tree;

public class tree {

    // printing of the tree
    // depth first traversal

    // 1. preorder
    static void preorder_traversal(treenode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder_traversal(root.l);
        preorder_traversal(root.r);
    }

    // 2. inorder
    static void inorder_traversal(treenode root) {
        if (root == null) {
            return;
        }
        inorder_traversal(root.l);
        System.out.print(root.data + " ");
        inorder_traversal(root.r);
    }

    //3. postorder
    static void postorder_traversal(treenode root)
    {
        if(root==null)return;
        inorder_traversal(root.l);
        inorder_traversal(root.r);
        System.out.print(root.data+" ");
    }

    static int count(treenode root)
    {
        
        if(root==null) return 0;
        
        return 1+count(root.l)+count(root.r);
    }

    //4.

    //breadth first traversal


    
    public static void main(String[] args) {
        treenode root = new treenode(1);
        root.l = new treenode(2);
        root.r = new treenode(3);
        root.l.l = new treenode(4);
        root.l.r = new treenode(5);
        root.r.l = new treenode(6);
        root.r.r = new treenode(7);


        preorder_traversal(root);
        System.out.println(" ");
        inorder_traversal(root);
        System.out.println(" ");
        postorder_traversal(root);
        System.out.println(" ");
        System.out.println(count(root));
    }
}

class treenode {
    int data;
    treenode l;
    treenode r;

    treenode(int value) {
        this.data = value;
        this.l = null;
        this.r = null;
    }
}
