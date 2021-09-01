import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample12 {
    public static void main(String[] args) {
        Stream<Integer> s =  Stream.of(1,2,3,4,5,6);

        //map : instance 에 매퍼를 적용한 결과로 변환하는것
        //intermidiate method

        System.out.println(s.map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        }).collect(Collectors.toList()));

        Stream<Integer> c =  Stream.of(1,2,3,4,5,6);
        System.out.println(c.map(e -> e * 2).collect(Collectors.toList()));
    }

}


