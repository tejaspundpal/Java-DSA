import java.util.*;
public class LearnPriorityQueue {
    public static void main(String args[]){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(20);
        pq.offer(50);
        pq.offer(30);
        pq.offer(10);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

        Queue<String> pqs = new PriorityQueue<>();
        pqs.offer("Tejas");
        pqs.offer("Ketan");
        pqs.offer("Prathmesh");
        pqs.offer("Abhi");
        pqs.offer("Aabhi");

        System.out.println(pqs);

        Queue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(40);
        pqr.offer(20);
        pqr.offer(50);
        pqr.offer(30);
        pqr.offer(10);

        System.out.println(pqr);
        System.out.println(pqr.peek());
        pqr.poll();
        System.out.println(pqr);

    }
}
