import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample14 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("a,b,c", "d,e", "f", "g,h"); // 목표 : "," 로 스플릿하여 각각의 요소를 가지고싶다
        //flatMap : 각 인스턴스에 매퍼를 적용하여 flattening 하여 변환하는 메소드
        //flattening : 평평하게 해주는것
        List<String[]> list = s.map(new Function<String, String[]>() {
            @Override
            public String[] apply(String s) {
                return s.split(",");
            }
        }).collect(Collectors.toList());
        for ( String[] arr : list) {
            System.out.println(arr);
        }

        // 람다 사용
        Stream<String> c = Stream.of("a,b,c", "d,e", "f", "g,h");
        List<String[]> strings  = c.map(e->e.split(",")).collect(Collectors.toList());
        for (String[] arr : strings) {
            System.out.println("arr = " + arr);
        }

        Stream<String> r = Stream.of("a,b,c", "d,e", "f", "g,h");
        //Arrays.stream-> Array 를 stream 으로 반환함
        List<String> list1 = r.flatMap(e -> Arrays.stream(e.split(","))).collect(Collectors.toList());
        System.out.println(list1);
    }

}


