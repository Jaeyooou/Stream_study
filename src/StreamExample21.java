import java.util.stream.Stream;

public class StreamExample21 {
    public static void main(String[] args) {

        /*
         * anyMatch : test 가 통과한 instance 가 하나라도 있으면 true 반환
         *  allMatch: test 가 통과한 instance 가 모두 통과해야  true 반환
         *  noneMatch test 가 통과한 instance 가  하나도 없으면 true 반환
         * */
        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).anyMatch(e -> e > 8));
        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).allMatch(e -> e > 8));
        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).noneMatch(e -> e > 8));

    }

}


