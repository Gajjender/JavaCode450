class printBinaryTree{
    static final int COUNT = 10;

    static class Node
    {
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    };

    static void print2DUtil(Node root, int space)
    {
        if(root==null)
        return;

        space += COUNT;
        print2DUtil(root.right,space);

        System.out.print("\n");
        for(int i=COUNT;i<space;i++){
            System.out.print(" ");
        }
        System.out.print(root.data + "\n");

        print2DUtil(root.left,space);
    }

    static void print2D(Node root)
    {
        print2DUtil(root,0);
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        print2D(root);
    }
}