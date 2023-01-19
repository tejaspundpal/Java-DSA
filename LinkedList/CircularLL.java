package Java_DSA.LinkedList;

import java.util.Scanner;

public class CircularLL
{
    private Node head;
    private int size;
    public CircularLL(int size){
        this.size = size;
    }

    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void display()
    {
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }
        Node ptr = head;
        do{
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }while(ptr != head);
        System.out.println("head");
    }
    public void insertFirst(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            head.next = head;
            size++;
            return;
        }
        Node ptr = head;
        while(ptr.next != head){
            ptr = ptr.next;
        }
        ptr.next = temp;
        temp.next = head;
        head = temp;
        size++;
    }
    public void insertLast(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            head.next = head;
            size++;
            return;
        }
        Node ptr = head;
        while(ptr.next != head){
            ptr = ptr.next;
        }
        ptr.next = temp;
        temp.next = head;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty,no data to delete.");
            return;
        }
        if(head.next == head){
            head = null;
            size--;
            return;
        }
        Node ptr = head;
        while(ptr.next != head){
            ptr = ptr.next;
        }
        head = head.next;
        ptr.next = head;
        size--;
    }

    public void deleteLast()
    {
        if(head==null) {
            System.out.println("List is Empty,no data to delete.");
            return;
        }
        if(head.next == head) {
            head = null;
            size--;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != head){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next =lastNode.next ;
        size--;
    }
    public int search(int x){
        int count = 0;
        if(head == null){
            System.out.println("List is Empty.");
            return -1;
        }
        else{
            Node ptr = head;
            do{
                count++;
                if(ptr.data == x)
                    return count;
                ptr = ptr.next;
            }while(ptr != head);
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLL list = new CircularLL(0);
        boolean flag = true;
        System.out.println("1)Insert at the beginning.\n2)Insert at end.\n3)Delete first.\n4)Delete last.\n5)Display.\n6)Find size.\n7)Search the data.\n8)Exit");
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
                    list.deleteFirst();
                }
                case 4->{
                    list.deleteLast();
                }
                case 5->{
                    list.display();
                }
                case 6->{
                    System.out.println("Total size of Linked list : "+ list.size);
                }
                case 7->{
                    System.out.println("Enter data to search :");
                    int val = sc.nextInt();
                    int result = list.search(val);
                    if(result == -1)
                        System.out.println("Data is not present in list.");
                    else
                        System.out.println("Data is present at position : "+result);
                }
                case 8->{
                    flag = false;
                }
                default->{
                    System.out.println("Invalid choice..!");
                }
            }
        }
    }
}
