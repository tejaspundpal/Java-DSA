import java.util.*;
public class LearnTreeSet {
    public static void main(String args[]){
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(7);
        set.add(25);
        set.add(52);
        set.add(44);

        System.out.println(set);
        set.remove(52);
        System.out.println(set);

        System.out.println(set.contains(25));
        System.out.println(set.isEmpty());

        set.add(10);
        System.out.println(set);
        System.out.println("Min element "+ set.pollFirst());
        System.out.println("Min element "+ set.pollLast());
    }
}



