package Java_DSA.Stack;

import java.util.EmptyStackException;
import java.util.Scanner;

public class StackLL {
    private Node top;

    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return;
        }
        Node ptr = top;
        while(ptr != null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
        System.out.println();
    }

    public void push(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            top = temp;
            return;
        }
        temp.next = top;
        top = temp;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty,No element to pop.");
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            throw new EmptyStackException();
        }
        return top.data;
    }

    public int calSize(){
        int size = 0;
        if(isEmpty()){
            return 0;
        }
        Node ptr = top;
        while(ptr != null){
            size++;
            ptr = ptr.next;
        }
        return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL stack = new StackLL();
        boolean flag = true;
        System.out.println("1)Push.\n2)Pop.\n3)Peek.\n4)Display.\n5)Calculate size.\n6)Exit.");
        while(flag){
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Enter data to push : ");
                    int value = sc.nextInt();
                    stack.push(value);
                }
                case 2->{
                    System.out.println("Popped element is : "+stack.pop());
                }
                case 3->{
                    System.out.println("Peek of stack is : "+stack.peek());
                }
                case 4->{
                    stack.display();
                }
                case 5->{
                    System.out.println("Size of the stack is : "+stack.calSize());
                }
                case 6->{
                    flag = false;
                }
                default -> {
                    System.out.println("Invalid choice..!!");
                }
            }
        }
    }
}
