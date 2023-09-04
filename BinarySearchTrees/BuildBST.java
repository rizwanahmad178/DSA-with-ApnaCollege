package BinarySearchTrees;

import java.util.ArrayList;

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

    public static void printRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        }
        if(root.data > k2){
            printRange(root.left, k1, k2);
        }else if(root.data < k1){
            printRange(root.right, k1, k2);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path ){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data <= min.data){
            return false;
        }else if(max!=null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
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
        //int values[] = {8,5,3,1,4,6,10,11,14};
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        System.out.println("Insert Method");
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }    
        inorder(root);
        // System.out.println("\nSearch Method");
        // if(search(root, 6)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }
        // System.out.println("\nDelete Method");
        // root = delete(root,1);
        // System.out.println();
        // inorder(root);
        // System.out.println("\nPrint Range Method");
        // printRange(root, 5, 12);
        // System.out.println("\nRoot to Leaf Path Method");
        // printRoot2Leaf(root, new ArrayList<>());
        if(isValid(root, null, null)){
            System.out.println("Valid BST");
        }else{
            System.out.println("Not Valid BST");
        }
    }
}
