public class balanced_binary__tree {
    // the difference of  height of right subtree and left subtree not more than one...
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
static class binary{
    static int index = -1;
    public static Node buildtree(int Nodes[]){
        index++;
        if(Nodes[index] == -1){
            return null;
        }
        Node newnode = new Node(Nodes[index]);
        newnode.left = buildtree(Nodes);
        newnode.right = buildtree(Nodes);
        return newnode;
    }
}   
public static int height(Node root){
    if(root == null){
        return 0;
    }

    int leftheight = height(root.left);
    int rightheight = height(root.right);
    return Math.max(leftheight, rightheight) + 1;
}
public static boolean isbalanced(Node root){
    if(root == null){
        return true;
    }
    int leftheight = height(root.left);
    int rightheight = height(root.right);
    if(Math.abs(leftheight - rightheight) > 1){ // abs is used to find the absolute difference... means difference without sign...
        return false;
    }
    return true;
}
    public static void main(String[] args) {
        int nodes[]  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary tree = new binary();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);
        System.out.println(height(root));
        System.out.println(isbalanced(root));
    }   
}
