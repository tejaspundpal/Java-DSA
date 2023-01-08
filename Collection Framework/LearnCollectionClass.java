import java.util.*;
public class LearnCollectionClass
{
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(25);
        list.add(7);
        list.add(13);
        list.add(42);
        list.add(34);
        list.add(71);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);

        System.out.println(Collections.frequency(list,25));

        Student s1 = new Student(111,"Pranav",20);
        Student s3 = new Student(113,"Psrp",20);
        Student s2 = new Student(112,"Tejas",21);
        Student s4 = new Student(102,"PP",21);

        List<Student> st = new ArrayList<Student>();

        st.add(s4);
        st.add(s2);
        st.add(s3);
        st.add(s1);

        System.out.println(st);
        Collections.sort(st);
        System.out.println(st);
        Collections.sort(st,((o1, o2) -> o1.name.compareTo(o2.name)));
        System.out.println(st);
    }
}
