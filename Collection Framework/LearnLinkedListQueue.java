import java.util.*;
public class LearnLinkedListQueue {
    public static void main(String args[]){
        Queue<Integer> que = new LinkedList<>();

        que.add(10);
        que.add(20);
        que.add(30); //add throws exception when error
        System.out.println(que);

        que.offer(40);
        que.offer(50);// use offer while adding element
        System.out.println(que);

        System.out.println(que.remove()); //throws exception
        System.out.println(que.poll());
        System.out.println(que.element()); //throws exception
        System.out.println(que.peek());
        System.out.println(que.isEmpty());
    }
}
