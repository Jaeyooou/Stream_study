import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample30 {
    public static void main(String[] args) {

        /*
        partitianingBy : key 와 value 의 맵으로 grouping 을 하는기능을 제공
         * */

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect = stream.collect(Collectors.partitioningBy(e -> e % 2 == 1));
        //test 에 통과한 Integer의 list , 통과하지 않은 Integer 의 List 로 그룹화 해줌
        System.out.println(collect);

        Map<Integer, List<Integer>> collect1 = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.groupingBy(e -> e % 3));
        System.out.println("collect1 = " + collect1);
        //어떠한 인자가 들어왔을 때 어떠한 값으로 반환해주는데, 그 반환값이 map 의 key 가 됨
    }

}


