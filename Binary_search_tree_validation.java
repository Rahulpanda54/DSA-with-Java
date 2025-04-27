public class Binary_search_tree_validation {
    static class Node {
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
    public static boolean VALID_BST(Node root){
        return isvalid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean isvalid(Node root,int min,int max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        return isvalid(root.left, min , root.data) && isvalid(root.right, root.data, max); 
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        System.out.println(root.data);
        inorder(root);
        System.out.println();
        System.out.println(VALID_BST(root));
        
    }
}