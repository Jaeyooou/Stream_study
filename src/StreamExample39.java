import java.util.stream.Stream;

public class StreamExample39 {


    public static void main(String[] args) {

        /*
         *reduce 의 병렬처리 combine
         * 일반적인 stream의 처리와 parallel

         * */

        //일반적인 스트림에서는 Combiner 실행 안됨
        Integer reduce = Stream.of(1, 2, 3, 4, 5)
                .reduce(1
                        , (e1, e2) -> {
                            System.out.println("accumulator" + e1 + " *" + e2 + " =" + e1 * e2);

                            return e1 * e2;
                        }, (e1, e2) -> {
                            System.out.println("combiner" + e1 + " *" + e2 + " =" + e1 * e2);


                            return e1 * e2;
                        });

        System.out.println("reduce = " + reduce);
        Integer reduce2 = Stream.of(1, 2, 3, 4, 5)
                .parallel().reduce(1
                        , (e1, e2) -> {
                            System.out.println("accumulator " + e1 + " *" + e2 + " =" + e1 * e2);

                            return e1 * e2;
                        }, (e1, e2) -> {
                            System.out.println("combiner " + e1 + " *" + e2 + " =" + e1 * e2);


                            return e1 * e2;
                        });

        System.out.println("reduce2 = " + reduce2);

    }

}


