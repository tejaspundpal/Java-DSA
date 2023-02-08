package Java_DSA.Queue;

import java.util.Scanner;

public class QueueArray {
    private int front;
    private int rear;
    private final int[] queue;
    private static int size = 10;

    public QueueArray(){
        this(size);
    }
    public QueueArray(int size){
        this.size = size;
        this.queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return ((front == -1) && (rear == -1)) || front > rear;
    }
    public boolean isFull(){
        return rear == size - 1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty,Nothing to display.");
        }
        else{
            for(int i = front;i <= rear;i++){
                System.out.print(queue[i]+" ");
            }
        }
        System.out.println();
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full,You cannot add data.");
        }
        else if(front == -1 && rear == -1){
            front = 0;
            rear++;
            queue[rear] = data;
        }
        else{
            rear++;
            queue[rear] = data;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty,No data to dequeue");
            return -1;
        }
        else if(front == rear){
            int data = queue[front];
            front = -1;
            rear = -1;
            return data;
        }
        else{
            int data = queue[0];
            for(int i = 0;i < queue.length-1;i++){
                queue[i] = queue[i+1];
            }
            rear--;
            return data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray que = new QueueArray(5);
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
