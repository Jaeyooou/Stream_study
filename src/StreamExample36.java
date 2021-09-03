import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample36 {


    public static void main(String[] args) {

        /*
         *teeing : Collector 두개를 합쳐서 병합할 수 있는 기능
         * */
        //4로 나눈 나머지가 1인 instance 들과
        //4로 나눈 나머지가 2인 instance 들의
        //teeing 수행
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        List<Integer> collect = stream.collect(Collectors
                .teeing(Collectors.filtering(e -> e % 4 == 1, Collectors.toList()),
                        Collectors.filtering(e -> e % 4 == 2, Collectors.toList()),
                        (List<Integer> l1, List<Integer> l2) -> {
                            l1.addAll(l2);
                            return l1;
                        }));
        System.out.println("collect = " + collect);

    }

}


