import java.util.HashSet;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class StreamExample40 {


    public static void main(String[] args) {

        /*
         *Collect 에서의 Combiner

         * */

        //HashSet 으로 collect
        HashSet<Object> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(HashSet::new,
                (s, e) -> s.add(e), (s1, s2) -> {

                });
        System.out.println("collect = " + collect);


        HashSet<Integer> collect1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(() -> new HashSet<Integer>(),
                new BiConsumer<HashSet<Integer>, Integer>() {
                    @Override
                    public void accept(HashSet<Integer> integers, Integer integer) {
                        integers.add(integer);
                    }
                }, new BiConsumer<HashSet<Integer>, HashSet<Integer>>() {
                    @Override
                    public void accept(HashSet<Integer> integers, HashSet<Integer> integers2) {
                        integers.addAll(integers2);
                    }
                });
        System.out.println("collect1 = " + collect1);
    }

}


