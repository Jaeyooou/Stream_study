import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample13 {
    public static void main(String[] args) {
        int sum = Stream.of(1,2,3,4,5,6).mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        }).sum();// mapToInt : Integer 로 보장되어있음 , 따라서 다양한 메소드 활용 가능
        System.out.println("sum = " + sum);

        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).sum()); // 합
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).min().getAsInt()); // 최솟값
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).max().getAsInt()); // 최대값
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).count()); // 갯수
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).average().getAsDouble()); // 평균
        IntSummaryStatistics intSummaryStatistics = Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).summaryStatistics();// 다양한 통계적 지표를 추상화 해 놓은것
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);

    }

}


