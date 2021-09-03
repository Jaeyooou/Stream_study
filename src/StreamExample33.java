import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample33 {


    public static void main(String[] args) {

        /*
         *finisher
         * */

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Integer size = stream.collect(Collectors.collectingAndThen(Collectors.toList(), e -> e.size()));

        System.out.println("size = " + size);
    }

}


