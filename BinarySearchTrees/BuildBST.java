package BinarySearchTrees;

public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;
         public Node(int data){
            this.data = data;
         }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left =  delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else{
            //case 1 : leaf Node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 : one Child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case 3 : both Child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        //int values[] = {5,1,3,4,2,7};
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        System.out.println("Insert Method");
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }    
        inorder(root);
        System.out.println("\nSearch Method");
        if(search(root, 6)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
        System.out.println("\nDelete Method");
        root = delete(root,1);
        System.out.println();
        inorder(root);
    }
}
