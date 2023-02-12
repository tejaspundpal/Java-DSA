package Java_DSA.Queue;

import java.util.Scanner;

    private Node front;
    private Node rear;

    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty,nothing to display.");
        }
        Node ptr = front;
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public void enqueue(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty,you cannot dequeue.");
            return -1;
        }
        int data = front.data;
        front = front.next;
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL que = new QueueLL();
        boolean flag = true;
        System.out.println("1)Enqueue element in Queue.\n2)Dequeue element from Queue.\n3)Display Queue.\n4)Exit");
        while(flag)
        {
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter element to add in Queue : ");
                    int queue_data = sc.nextInt();
                    que.enqueue(queue_data);
                }
                case 2 -> {
                    int queue_element = que.dequeue();
                    System.out.println("Dequeued element is : "+queue_element);
                    System.out.println();
                }
                case 3 -> {
                    que.display();
                }
                case 4 -> {
                    flag = false;
                }
                default -> System.out.println("Enter the valid choice...!!!!");
            }
        }
    }

}

