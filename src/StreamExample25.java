import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample25 {
    public static void main(String[] args) {

        /*
        collectors: 다양한 built-in collector 를 편의를 위해 제공한다
        
         * */
        Stream<String> s = Stream.of("Hello", "KMOOC", "Data", "Engineering");

        Set<String> collect1 = s.collect(Collectors.toSet());

    }

}


