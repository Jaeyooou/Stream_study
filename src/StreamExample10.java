import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample10 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        //binaryOperator : 두개인자를 받아 apply 메소드를 수행하고 단일 R타입의 값을 반환함

        //최댓값으로 reduction
        Optional<Integer> optionalInt = s.reduce(new BinaryOperator<Integer>() {
           //단일 반환값을 계속해서 수행하겠다.
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                if(integer > integer2)
                    return integer;
                else
                    return integer2;

            }
        });
        System.out.println(optionalInt.get());

    }
}


