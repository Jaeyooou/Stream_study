import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample29 {
    public static void main(String[] args) {

        /*
        collectors: 다양한 built-in collector 를 편의를 위해 제공한다
        toCollection : Collection 으로 반환하는것
         * */
        //reducing : reduce 와 거의 동일한 방법으로 동작함

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
//        Optional<Integer> min = stream.min((e1, e2) -> {
//            if (e1 > e2) return 1;
//            else if (e1 == e2) return 0;
//            else return -1;
//
//        });
//        System.out.println("min.get() = " + min.get());
        //최솟값
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.reducing(Math::min)).get());
        //idendity 설정 
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.reducing(Integer.MAX_VALUE, Math::min)));

        Stream<String> stream1 = Stream.of("1", "2", "3", "4", "5", "6");
        System.out.println(stream1.map(e -> Integer.parseInt(e)).collect(Collectors.reducing(Math::min)).get());

        System.out.println(Stream.of("1", "2", "3", "4", "5", "6")
                .collect(Collectors.reducing(Integer.MAX_VALUE, Integer::parseInt, Math::min)));
        

    }

}


