package Java_DSA.Stack;

import java.util.Scanner;

public class StackArray {
    private int top;
    private int[] stack;
    private int size = 10;

    public StackArray(){
        stack = new int[size];
        top = -1;
    }

    public StackArray(int size){
        stack = new int[this.size];
        top = -1;
    }

    public boolean isEmptyStack()
    {
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFullStack()
    {
        if(top == size-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void push(int data)
    {
        if(isFullStack())
        {
            System.out.println("Stack Overflow....!!");
        }
        else
        {
            top++;
            stack[top] = data;
        }
    }
    public int pop()
    {
        int popped_element = 0;
        if(isEmptyStack())
        {
            System.out.println("Stack is Empty,You cannot perform pop...!!");
            return -1;
        }
        else
        {
            popped_element = stack[top];
            top--;
        }
        return popped_element;
    }

    public int peek()
    {
        if(isEmptyStack())
        {
            System.out.println("Stack is Empty..!! (top = -1)");
            return -1;
        }
        else {
            return stack[top];
        }
    }

    public void displayStack()
    {
        if(isEmptyStack())
        {
            System.out.println("Stack is Empty..!!");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray obj = new StackArray();
        boolean flag = true;
        System.out.println("1)Push element in Stack\n2)Pop element from stack\n3)Display peek of Stack\n4)Display Stack.\n5)Exit");
        while(flag)
        {
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter element to add in Stack : ");
                    int stack_data = sc.nextInt();
                    obj.push(stack_data);
                }
                case 2 -> {
                    int stack_element = obj.pop();
                    System.out.println("Popped element is : "+stack_element);
                    System.out.println();
                }
                case 3 -> {
                    int peek = obj.peek();
                    System.out.println("Peek of the stack is : "+peek);
                    System.out.println();
                }
                case 4 -> {
                    obj.displayStack();
                }
                case 5 -> {
                    flag = false;
                }
                default -> System.out.println("Enter the valid choice...!!!!");
            }
        }
    }
}

