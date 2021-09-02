import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample18 {
    public static void main(String[] args) {

        //limit : 초반 n개의 요소만을 유지
        //skip : 초반 n개의 요소 이외의 인스턴스들을 유지

        List<Integer> collect = Stream.of(2, 5, 9, 3, 6, 1).limit(2).collect(Collectors.toList());

        List<Integer> collect1 = Stream.of(2, 5, 9, 3, 6, 1).skip(2).collect(Collectors.toList());
        System.out.println("collect1 = " + collect);
        System.out.println("collect1 = " + collect1);

    }

}


