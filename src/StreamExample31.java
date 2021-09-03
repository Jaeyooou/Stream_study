import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample31 {
    public static void main(String[] args) {

        /*
        partitianingBy : key 와 value 의 맵으로 grouping 을 하는기능을 제공
         * */
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 1);

        //등장 횟수
        // System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toMap(e -> e, e -> 1)));
        //키가 중복되었을 떄 병합해야 하지만 여기선 그런 예외처리가 없음 따라서 mergeFunction 을 구현해야 함

        System.out.println(stream.collect(Collectors.toMap(e -> e, e -> 1, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        })));

        // 홀수의 합 , 짝수의 합
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 1).collect(Collectors.toMap(e -> e % 2 == 1, e -> e, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }

        })));

    }

}


