import java.lang.reflect.Array;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(53);
        l2.add(42);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(3);
        l1.add(6);
        l1.add(0,1);
        l1.add(0, 4);

        //l1.addAll(0,l2);
        l1.addAll(l2);

        //l1.clear();

        System.out.println(l1.contains(27));

        System.out.println(l1.indexOf(6));

        System.out.println(l1.lastIndexOf(6));

        l1.set(3, 2);

        //l1.retainAll(l2);

        //l1.removeAll(l2);

        //l1.removeIf(n -> (n%2==0));

        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
