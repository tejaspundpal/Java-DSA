import java.util.*;
public class LearnLinkedHashset {
    public static void main(String args[]){
        Set<Integer> set = new LinkedHashSet<>();

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
    }
}



