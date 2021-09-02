import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample19 {
    public static void main(String[] args) {
        //takewhile : Stream 에서 predicate 을 위배하기 전까지 유지
        //dropwhile : Stream 에서 predicate 을 위배하기 전 까지 무시


        List<Integer> collect = Stream.of(2, 5, 9, 3, 6, 1).takeWhile(e -> e < 6).collect(Collectors.toList()); // 2,5 만 남을것임
        List<Integer> collect1 = Stream.of(2, 5, 9, 3, 6, 1).dropWhile(e -> e < 6).collect(Collectors.toList()); // 9,3,6,1 만 남을것임

        System.out.println("collect1 = " + collect);
        System.out.println("collect1 = " + collect1);
    }

}


