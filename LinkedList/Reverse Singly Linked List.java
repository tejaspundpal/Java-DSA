 //This is the method to reverse a singly linked list.
 //You can use this method in my SinglyLL code as there is direct access to head to methods...
 
 public void reverseListIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
