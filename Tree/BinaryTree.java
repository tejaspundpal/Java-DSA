package Java_DSA.Tree;

import java.util.Scanner;

public class BinaryTree<Private> {
    private static Node left;
    private static Node right;

    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static int index = -1;
    public static Node createTree(int[] nodes){
    index++;
    if(nodes[index] == -1){
        return null;
    }
        Node temp = new Node(nodes[index]);
        temp.left = createTree(nodes);
        temp.right = createTree(nodes);

        return temp;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nodes = {4,7,2,-1,-1,3,9,-1,-1,10,-1,-1,5,-1,15,11,-1,-1,14,-1,-1};
        Node root = createTree(nodes);
        System.out.println("Preorder traversal ");
        preorder(root);
        System.out.println();
        System.out.println("Inorder traversal ");
        inorder(root);
        System.out.println();
        System.out.println("postorder traversal ");
        postorder(root);
    }
}
