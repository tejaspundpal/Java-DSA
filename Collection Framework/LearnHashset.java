import java.util.*;
public class LearnHashset {
    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();

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

        set.remove(22);
        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        set1.add(101);
        set1.add(150);
        set1.add(122);

        set.addAll(set1);
        System.out.println(set);

        set.removeAll(set1);
        System.out.println(set);
    }
}



