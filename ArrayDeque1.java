import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(6);
        ad1.add(7);
        ad1.add(3);
        ad1.addFirst(9);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        for (Integer integer : ad1) {
            System.out.print(integer);
            System.out.print(", ");
        }
        
    }
}
