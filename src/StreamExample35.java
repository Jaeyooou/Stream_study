import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample35 {


    public static void main(String[] args) {

        /*
         *
         * */

        //홀수의 합,짝수의 합
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.partitioningBy(e -> e % 2 == 1, Collectors.reducing((e1, e2) -> e1 + e2))));

        //3으로 나눈 나머지 키에 대한 갯수
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.groupingBy(e -> e % 3, Collectors
                        .mapping(e -> 1, Collectors
                                .reducing(0, (integer, integer2) -> integer + integer2)))));

        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors
                .groupingBy(e -> e % 3, Collectors.counting())));

    }

}


