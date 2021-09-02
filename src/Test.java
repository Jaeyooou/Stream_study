import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(6, 8, 4, 2, 1, 5);
        Integer answer = stream.reduce(9, (e1, e2) -> Math.max(e1, e2));
        System.out.println("answer = " + answer);
    }
}

