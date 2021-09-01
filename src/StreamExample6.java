import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamExample6 {
    public static void main(String[] args) {
        Stream<Double> s = Stream.of(1d, 2d, 3d, 4d, 5d);

        for (Double v : s.toArray(new IntFunction<Double[]>() {

            @Override
            public Double[] apply(int value) {
                //value 는 크기를 의미함
                return new Double[value];
            }
        })) {
            System.out.println(v);
        }
        s = Stream.of(1d, 2d, 3d, 4d, 5d);
        for(Double value : s.toArray(value -> new Double[value]))
            System.out.println("value = " + value);

        //더 축약됨
        s = Stream.of(1d, 2d, 3d, 4d, 5d);
        for(Double value : s.toArray(Double[] :: new)){
            //value 는 new Double 의 인자로 들어감
            System.out.println("value = " + value);
        }
        s = Stream.of(1d, 2d, 3d, 4d, 5d);
        s.forEach(e -> System.out.println(e));


        s = Stream.of(1d, 2d, 3d, 4d, 5d);

        s.forEach(System.out::println);

    }
}


