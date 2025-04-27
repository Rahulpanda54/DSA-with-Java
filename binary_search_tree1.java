public class binary_search_tree1{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void print_in_range(Node root ,int x,int y){
        if(root.data >= x && root.data <= y){
            print_in_range(root.left, x, y);
            System.out.print(root.data+" ");
            print_in_range(root.right, x, y);
        }
        else if(root.data >= y){
            print_in_range(root.left, x, y);
        }
        else{
            print_in_range(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
          root = insert(root, values[i]);
        }
        inorder(root);
        print_in_range(root, 2, 7);
    }
}