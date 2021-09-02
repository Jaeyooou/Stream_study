import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample17 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2, 5, 9, 3, 6, 1);
        //peek: stream의 각 인스턴스에 action 을 수행하지만, 스트림의 구성을 바꾸진 않는다 -> 부수적인 연산을 한다
        HashSet<Integer> set = new HashSet<>();

        List<Integer> collect = s.peek(e -> set.add(e)).collect(Collectors.toList());

        System.out.println("collect = " + collect);
        System.out.println("set = " + set); // 순서가 없기 때문에 임의로 들어감
     

    }

}


