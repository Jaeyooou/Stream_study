import java.util.stream.Stream;

public class StreamExample22 {
    public static void main(String[] args) {

        /*
        toArray: Array 를 반환
        forEach:
         * */
        Stream<Integer> stream = Stream.of(2, 5, 9, 3, 6, 1);
        Object[] objects = stream.toArray();
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
        Stream<Integer> stream2 = Stream.of(2, 5, 9, 3, 6, 1);
        Integer[] integers = stream2.toArray(Integer[]::new); // integer 형태로 변환해서 arraylist 로
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        Stream<Integer> stream3 = Stream.of(2, 5, 9, 3, 6, 1);
        stream3.forEach(System.out::println);
        
    }

}


