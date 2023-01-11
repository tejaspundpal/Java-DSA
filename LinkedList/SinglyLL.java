package Java_DSA.LinkedList;
import java.util.Scanner;

public class SinglyLL {
    private Node head;
    private int size;

    public SinglyLL(int size) {
        this.size = size;
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
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        size++;
    }

    public void insertLast(int data){
        Node temp = new Node(data);
        temp.next = null;
        if(head == null){
            head = temp;
            size++;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = temp;
        size++;
    }

    public void insertSpecific(int data,int index){
        Node temp = new Node(data);
        if((index < 1) || (index > size+1)){
            System.out.println("Invalid position..!");
        }
        else if(index == 1){
            insertFirst(data);
        }
        else if(index == size+1){
            insertLast(data);
        }
        else{
            Node ptr = head;
            Node ptr1;
            for(int i = 1;i < index-1;i++){
                ptr = ptr.next;
            }
            ptr1 = ptr.next;
            ptr.next = temp;
            temp.next = ptr1;
            size++;
        }

    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty,no data to delete.");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty,no data to delete.");
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }
    public void deleteSpecific(int index){
        if(head == null){
            System.out.println("List is Empty,no data to delete.");
            return;
        }
        if((index < 1) || (index > size)){
            System.out.println("Invalid position..!");
        }
        else if(index == 1){
            deleteFirst();
        }
        else if(index == size){
            deleteLast();
        }
        else{
            Node prevPtr = head;
            Node ptr = head.next;
            for(int i = 1;i < index-1;i++){
                ptr = ptr.next;
                prevPtr = prevPtr.next;
            }
            prevPtr.next = ptr.next;
            size--;
        }
    }

    public int search(int x){
        int count = 0;
        if(head == null){
            System.out.println("List is Empty.");
            return -1;
        }
        else{
            Node ptr = head;
            while(ptr != null){
                count++;
                if(ptr.data == x)
                    return count;
                ptr = ptr.next;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLL list = new SinglyLL(0);
        boolean flag = true;
        System.out.println("1)Insert at the beginning.\n2)Insert at end.\n3)Insert at specific position.\n4)Delete first.\n5)Delete last.\n6)Delete from specific index.\n7)Display.\n8)Find size.\n9)Search the data.\n10)Exit");
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
                    System.out.println("Enter data to insert : ");
                    int data = sc.nextInt();
                    System.out.println("Enter position : ");
                    int position = sc.nextInt();
                    list.insertSpecific(data,position);
                }
                case 4->{
                    list.deleteFirst();
                }
                case 5->{
                    list.deleteLast();
                }
                case 6->{
                    System.out.println("Enter position : ");
                    int position = sc.nextInt();
                    list.deleteSpecific(position);
                }
                case 7->{
                    list.display();
                }
                case 8->{
                    System.out.println("Total size of Linked list : "+ list.size);
                }
                case 9->{
                    System.out.println("Enter data to search :");
                    int val = sc.nextInt();
                    int result = list.search(val);
                    if(result == -1)
                        System.out.println("Data is not present in list.");
                    else
                        System.out.println("Data is present at position : "+result);
                }
                case 10->{
                    flag = false;
                }
                default->{
                    System.out.println("Invalid choice..!");
                }
            }
        }
    }
}
