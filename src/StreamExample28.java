import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample28 {
    public static void main(String[] args) {

        /*
        collectors: 다양한 built-in collector 를 편의를 위해 제공한다
        toCollection : Collection 으로 반환하는것
         * */
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        //joining : char sequence 에서만 작동하기 때문에
        //정수 -> map -> 문자열 -> joining collect
        System.out.println(stream.map(e -> String.valueOf(e)).collect(Collectors.joining(",", "joining", "example")));
        
    }

}


