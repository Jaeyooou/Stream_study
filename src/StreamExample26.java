import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample26 {
    public static void main(String[] args) {

        /*
        collectors: 다양한 built-in collector 를 편의를 위해 제공한다
        toCollection : Collection 으로 반환하는것
         * */
        Stream<Integer> stream = Stream.of(1, 1, 2, 2, 3, 4);
        List<Integer> collect = stream.collect(Collectors.toList());
        System.out.println(Stream.of(1, 1, 2, 2, 3, 4).collect(Collectors.toSet()));
        System.out.println(Stream.of(1, 1, 2, 2, 3, 4).collect(Collectors.toCollection(() -> new ArrayList<Integer>())));
        System.out.println(Stream.of(1, 1, 2, 2, 3, 4).collect(Collectors.toCollection(() -> new HashSet<Integer>())));
        System.out.println(Stream.of(1, 1, 2, 2, 3, 4).collect(Collectors.toCollection(() -> new LinkedList<Integer>())));

    }

}


