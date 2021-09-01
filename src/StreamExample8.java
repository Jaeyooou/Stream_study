import java.util.Comparator;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamExample8 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

        //Stream<Integer> -> IntStream로 변경됨
        // 스트림에 이 int 형태로 변경되며, 추가적인 메소드를 제공함
        int sum = (s.mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        })).sum();
        System.out.println("sum = " + sum);

    }
}


