import java.util.*;
public class LearnArrayListObject
{
    public static void main(String[] args) {
        Student s1 = new Student(111,"Pranav",20);
        Student s2 = new Student(112,"Tejas",21);
        Student s3 = new Student(113,"Psrp",20);
        List<Student> st = new ArrayList<Student>();

        st.add(s1);
        st.add(s2);
        st.add(s3);

        //System.out.println(st);------>it prints addresses

//        Iterator itr=st.iterator();
//        while(itr.hasNext()){
//            Student s=(Student)itr.next();
//            System.out.println(s.rollno+" "+s.name+" "+s.age);
//        }

        //easy method---->
        for (Student s : st) {
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }

        System.out.println(st);//after using toString in student class it shows correct output
    }
}
