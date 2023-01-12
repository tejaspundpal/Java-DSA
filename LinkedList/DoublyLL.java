package Java_DSA.LinkedList;

import java.util.Scanner;

public class DoublyLL {
    private Node head;
    private int size;

    public DoublyLL(int size) {
        this.size = size;
    }

    private static class Node{
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
        while(ptr != null){
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("end-null");
    }

    public void displayReverse()
    {
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }
        Node ptr = head;
        Node last = null;
        while(ptr != null){
            last = ptr;
            ptr = ptr.next;
        }
        while(last != null){
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("start-null");
    }

    public void insertFirst(int data){
        Node temp = new Node(data);
        temp.prev = null;
        if(head == null){
            head = temp;
            size++;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;
    }

    public void insertLast(int data){
        Node temp = new Node(data);
        if(head == null){
            temp.prev = null;
            head = temp;
            size++;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        temp.next = null;
        ptr.next = temp;
        temp.prev = ptr;
        size++;
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void insertAfter(int after,int data){
        Node prevNode = find(after);
        if(prevNode == null){
            System.out.println("Does not exist.");
            return;
        }
        Node temp = new Node(data);
        Node ptr = prevNode.next;

        temp.next = prevNode.next;
        prevNode.next = temp;
        temp.prev = prevNode;
        if(ptr != null)
            ptr.prev = temp;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty,no data to delete.");
            return;
        }
        head = head.next;
        if(head != null)
            head.prev = null;
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
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.prev.next = null;
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
            Node ptr = head;
            for(int i = 1;i < index;i++){
                ptr = ptr.next;
            }
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
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
        DoublyLL list = new DoublyLL(0);
        boolean flag = true;
        System.out.println("1)Insert at the beginning.\n2)Insert at end.\n3)Insert after specific data.\n4)Delete first.\n5)Delete last.\n6)Delete from specific index.\n7)Display.\n8)Display reverse.\n9)Find size.\n10)Search the data.\n11)Exit");
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
                    int newdata = sc.nextInt();
                    System.out.println("Enter data after which you want to insert new data : ");
                    int data = sc.nextInt();
                    list.insertAfter(data,newdata);
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
                    list.displayReverse();
                }
                case 9->{
                    System.out.println("Total size of Linked list : "+ list.size);
                }
                case 10->{
                    System.out.println("Enter data to search :");
                    int val = sc.nextInt();
                    int result = list.search(val);
                    if(result == -1)
                        System.out.println("Data is not present in list.");
                    else
                        System.out.println("Data is present at position : "+result);
                }
                case 11->{
                    flag = false;
                }
                default->{
                    System.out.println("Invalid choice..!");
                }
            }
        }
    }

}
