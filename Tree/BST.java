package Java_DSA.Tree;

import java.util.Scanner;

public class BST {
    private static Node root;

    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        Node temp = new Node(val);
        if(root == null){
            root = temp;
            return root;
        }
        if(val < root.data){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void insert(int val){
        Node p = root;
        Node ptr = null;
        while(p != null){
            ptr = p;
            if(val < p.data){
                p = p.left;
            }
            else if(val > p.data){
                p = p.right;
            }
            else{
                System.out.println(val +" is already present in tree.");
                return;
            }
        }
        Node temp = new Node(val);

        if(ptr == null)
            root = temp;
        else if(val < ptr.data)
            ptr.left = temp;
        else
            ptr.right = temp;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(key < root.data){
            return search(root.left,key);
        }
        else if(key == root.data){
            return true;
        }
        else{
            return search(root.right,key);
        }
    }

    public static Node delete(Node root,int val){
        if(search(root,val)) {
            if (val < root.data) {
                root.left = delete(root.left, val);
            } else if (val > root.data) {
                root.right = delete(root.right, val);
            } else {  //root.data == val
                if (root.left == null && root.right == null) {
                    return null;
                }
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
                else {
                    Node IS = inorderSuccesser(root.right);
                    root.data = IS.data;
                    root.right = delete(root.right, IS.data);
                }
            }
        }
        else
            System.out.println("Data is not present to delete.");

        return root;
    }

    public static Node inorderSuccesser(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Node root = null;
        boolean flag = true;
        System.out.println("1)Insert data.\n2)Search.\n3)Delete.\n4)Display inorder.\n5)Count the nodes.\n6)Exit.");
        while(flag){
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Enter data to insert : ");
                    int data = sc.nextInt();
                    //root = insert(root,data);
                    insert(data);
                }
                case 2->{
                    System.out.println("Enter data to search : ");
                    int searchValue = sc.nextInt();
                    if(search(root,searchValue))
                        System.out.println("Found");
                    else
                        System.out.println("Not found");
                }
                case 3->{
                    System.out.println("Enter data to delete : ");
                    int dataToDelete = sc.nextInt();
                    root = delete(root,dataToDelete);
                }
                case 4->{
                    inorder(root);
                    System.out.println();
                }
                case 5->{
                    System.out.println("Number of nodes : "+countNode(root));
                    System.out.println();
                }
                case 6->{
                    flag = false;
                }
                default -> {
                    System.out.println("Invalid choice..!");
                }
            }
        }
    }
}
