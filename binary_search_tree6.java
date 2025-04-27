public class binary_search_tree6 {
    public static class Node{
        int data;
        Node right;
        Node left;
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
    public static boolean isVALID_BST(Node root,Node left,Node right){
        if(root == null){
            return true;
        }
        if(left != null && root.data <= left.data){
            return false;
        }
        else if(right != null && root.data >=right.data){
            return false;
        }
return isVALID_BST(root.left, left, root) && isVALID_BST(root.right, root, right);
 }
    public  static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
         int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
       System.out.println(isVALID_BST(root, null, null)); 
    }
}