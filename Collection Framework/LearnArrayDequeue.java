import java.util.*;
public class LearnArrayDequeue {
    public static void main(String args[])
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);
        adq.offerLast(20);
        adq.offerFirst(5);
        adq.offerLast(50);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

    }
}
