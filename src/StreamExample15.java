import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample15 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,2,3,1,2,5,6); // 목표 : "," 로 스플릿하여 각각의 요소를 가지고싶다
        //distinct : Stream의 중복을 제거하는 intermideate method
        List<Integer> collect = s.distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

}


