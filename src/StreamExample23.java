import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample23 {
    public static void main(String[] args) {

        /*
        reduce : Stream T 전체를 T identity 에라는 단일 결과값에 Reduction 함
        
         * */
        Stream<Integer> stream = Stream.of(2, 5, 9, 3, 6, 1);

        Optional<Integer> reduce = stream.reduce((e1, e2) -> {
            if (e1 > e2) return e2;
            else return e1;
        });
        System.out.println("reduce = " + reduce.get());
        //Optioanl : Non-Null Stream 결과로, 비어있는 결과 와 비어있지 않은 결과를 추상화한것임

        Stream<Integer> stream2 = Stream.of(22222, 55555, 10000, 44444, 33333, 22222);
        Integer min = stream2.reduce(9999, (e1, e2) -> Math.min(e1, e2));//identity : 모든 t에 대해서 identity 를 수행했을 때 t가 나와야 한다는것임
        //indentity 와 stream을 비교하여 최솟값을 찾음

        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).reduce(0, (e1, e2) -> e1 + e2)); // 모든 값의 합
        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).reduce(1, (e1, e2) -> e1 * e2)); // 모든 값의 곱
        
    }

}


