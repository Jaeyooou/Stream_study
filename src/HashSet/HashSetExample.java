package HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        a.add(2);
        a.add(4);
        a.add(20);
        a.add(5);
        a.add(10);
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(6);
        b.add(10);
        b.add(30);
        b.add(15);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a.containsAll(b));
//
//        a.addAll(b);
//        System.out.println("a = " + a);
//        a.retainAll(b);
//        System.out.println("a = " + a);
        a.removeAll(b);
        System.out.println("a = " + a);
    }
}
