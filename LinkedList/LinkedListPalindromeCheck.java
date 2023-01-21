//Checking linked list is palindrome or not.
package Java_DSA.LinkedList;

import java.util.Scanner;

public class LinkedListPalindromeCheck {
    private Node head;

    public LinkedListPalindromeCheck() {
        head = null;
    }

    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display()
    {
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void insertLast(int data){
        Node temp = new Node(data);
        temp.next = null;
        if(head == null){
            head = temp;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = temp;
    }

    public Node reverse(Node head){
        Node prevNode = null;
        Node currNode = head;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        return prevNode;
    }

    public Node findMiddle(){
        Node hare =head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node middle = findMiddle();
        Node secondHalfFirst = reverse(middle.next);
        Node firstHalfFirst = head;
        while(secondHalfFirst != null){
            if(firstHalfFirst.data != secondHalfFirst.data){
                return false;
            }
            firstHalfFirst = firstHalfFirst.next;
            secondHalfFirst = secondHalfFirst.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPalindromeCheck list = new LinkedListPalindromeCheck();
        boolean flag = true;
        System.out.println("1)Insert at the beginning.\n2)Insert at end.\n3)Display\n4)Check Palindrome.\n5)Exit.");
        while(flag){
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Enter data to insert : ");
                    int data = sc.nextInt();
                    list.insertFirst(data);
                }
                case 2->{
                    System.out.println("Enter data to insert : ");
                    int data = sc.nextInt();
                    list.insertLast(data);
                }
                case 3->{
                    list.display();
                }
                case 4->{
                    boolean result = list.isPalindrome();
                    if(result)
                        System.out.println("List is Palindrome.");
                    else
                        System.out.println("list is not Palindrome.");
                }
                case 5->{
                    flag = false;
                }
            }
        }
    }
}
