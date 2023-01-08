import java.util.*;

public class LearnHashsetObject
{
    public static void main(String[] args) {
        Set<Student>st = new HashSet<Student>();
        Student s1 = new Student(111,"Pranav",20);
        Student s2 = new Student(112,"Tejas",21);
        Student s3 = new Student(113,"Psrp",20);
        Student s4 = new Student(113,"PR",21);

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        //System.out.println(st);

        for(Student s:st)
        {
            System.out.println(s.name + " " + s.rollno + " " + s.age);
        }
    }
}
