package Java_DSA.LinkedList;

public class CheckCycle {
    private Node head;

    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean detectCycle(Node head){
        if(head == null){
            return false;
        }
        Node hare = head; //fast pointer
        Node turtle = head; //slow pointer
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}
