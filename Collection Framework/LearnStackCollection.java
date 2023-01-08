import java.util.*;
public class LearnStackCollection {
    public static void main(String args[])
    {
        Stack<String> students = new Stack<>();
        students.push("Tejas");
        students.push("Sharvari");
        students.push("Jayashri");

        System.out.println(students);

        students.pop();
        System.out.println(students);

        System.out.println(students.isEmpty());
        System.out.println(students.peek());

        System.out.println(students.empty());

        Iterator<String> it = students.iterator();
        while(it.hasNext()){
            System.out.println("stack elements : "+it.next());
        }
    }
}
