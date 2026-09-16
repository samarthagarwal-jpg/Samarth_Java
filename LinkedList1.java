import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {

        //LINKEDLIST HASE SIMILAR METHODS AS ARRAYLIST BUT ONLY HAS SOME DIFFERENT METHODS.

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(53);
        l2.add(42);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(3);
        l1.add(6);
        l1.addLast(21);
        l1.add(0,1);
        l1.add(3, 4);
        l1.addFirst(11);



        //System.out.println(l1.contains(27));

        //System.out.println(l1.indexOf(6));

        //System.out.println(l1.lastIndexOf(6));

        l1.set(3, 2);

        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
    
}
