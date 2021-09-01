import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamExample9 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        //BiConsumer -> accept(T t, U u) : 단순히 소비하는것
        //Supplier : 단순히 반환하는것, 모아줄 수 있는 용기 

        //1,2,3,4,5 -> 12345
        StringBuilder stringBuilder = s.collect(new Supplier() {
            @Override
            public Object get() {
                return new StringBuilder();
            }
        }, new BiConsumer<StringBuilder, Integer>() {
            @Override
            public void accept(StringBuilder stringBuilder, Integer integer) {
                stringBuilder.append(integer);
            }
        }, (b1,b2)->{
        });
        System.out.println("stringBuilder = " + stringBuilder.toString());
    }
}


