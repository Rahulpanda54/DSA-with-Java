import java.util.ArrayList;
public class binary_search_tree_root2leafpath {
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
            root.left = insert(root.left,val);
        }
        else{
          root.right = insert(root.right,val);
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
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }
    public static void print_root2leaf(Node root,ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        else{
        print_root2leaf(root.left, path);
        print_root2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
     int values[] = {8,5,3,6,10,11,14};
     Node root = null;
     for(int i=0;i<values.length;i++){
        root = insert(root, values[i]);
       }
       System.out.println(root.data);
       inorder(root);   
       System.out.println();
       print_root2leaf(root, new ArrayList<>());
    }
}