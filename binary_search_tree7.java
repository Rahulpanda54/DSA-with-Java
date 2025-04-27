public class binary_search_tree7 {
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
public static Node create_BST(int arr[],int st,int end){
    if(st > end){
        return null;
    }
    int mid = (st + end) / 2;
    Node root = new Node(arr[mid]);
    root.left = create_BST(arr, st, mid-1);
    root.right = create_BST(arr, mid+1, end);
    return root;
}

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = create_BST(arr, 0, arr.length-1);
        preorder(root);
        System.out.println();
        inorder(root);
    } 
}
