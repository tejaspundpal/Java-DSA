package Java_DSA.LinkedList;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void insertLast(int data) {
        Node temp = new Node(data);
        temp.next = null;
        if (head == null) {
            head = temp;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = temp;
    }
    public void removeDupllicates(){
        if(head == null || head.next == null){
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
        boolean flag = true;
        System.out.println("1)Insert at the beginning.\n2)Insert at end.\n3)Display\n4)Remove duplicates from list.\n5)Exit.");
        while (flag) {
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("********** Enter elements in sorted order **********");
                    System.out.println("Enter data to insert : ");
                    int data = sc.nextInt();
                    list.insertFirst(data);
                }
                case 2 -> {
                    System.out.println("********** Enter elements in sorted order **********");
                    System.out.println("Enter data to insert : ");
                    int data = sc.nextInt();
                    list.insertLast(data);
                }
                case 3 -> {
                    list.display();
                }
                case 4 -> {
                    list.removeDupllicates();
                }
                case 5 -> {
                    flag = false;
                }
            }
        }
    }
}
