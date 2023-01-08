import java.util.*;
public class LearnArraylistOperations
{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(1,15);
        System.out.println(list);

        List<Integer> newlist = new ArrayList<>();
        newlist.add(50);
        newlist.add(60);

        list.addAll(newlist);
        System.out.println(list);

        newlist.clear();
        System.out.println(newlist);

        System.out.println(list.get(1));
     //   System.out.println(newlist.get(1));

        list.remove(1);
        list.remove(Integer.valueOf(60));

        list.set(2,25);
        System.out.println(list);

        System.out.println(list.contains(25));
        System.out.println(list.contains(30));
        list.add(85);
        list.add(60);
        list.add(77);
        list.add(52);

        for(int i = 0;i < list.size();i++){
            System.out.println("Element is "+ list.get(i));
        }

        System.out.println();

        for(Integer element:list){
            System.out.println("for each element "+ element);
        }

        System.out.println();

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator element "+ it.next());
        }

        Collections.sort(list);

        System.out.println(list);
    }
}
