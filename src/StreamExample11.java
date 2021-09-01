import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample11 {
    public static void main(String[] args) {
        Stream<Integer> s =  Stream.of(7, 4, 17, 3, 2);
        //filter : 각 instance 를 test 하여 성공하면 유지하는 메소드
        // 3보다 큰 값들을 유지하여, List 로 반환

        List<Integer> integerList = s.filter(e-> e > 3).collect(Collectors.toList());
        System.out.println("integerList = " + integerList);
    }

}


