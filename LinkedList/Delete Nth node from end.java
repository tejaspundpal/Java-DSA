//This is method to delete Nth node from end of the linked list.
//if method cannot have access to head then you have to pass head to function.Here I am not passing head as my linked list having access to head.

public void deleteNthFromEnd(int n){
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }
        int searchIndex = (size-n)+1;
        Node prev = head;
        int i = 1;
        while(i < searchIndex-1){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
