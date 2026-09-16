import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>(6,0.5f);
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);
        hs1.add(5);

        //Object[] arr = hs1.toArray();
        //System.out.println(Arrays.toString(arr));

        //hs1.spliterator().forEachRemaining(System.out::println);

        System.out.println(hs1);

    }
}
