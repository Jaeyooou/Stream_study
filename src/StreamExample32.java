import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample32 {
    static String str = "A sequence of elements supporting sequential and parallel aggregate\n" +
            "     * operations.  The following example illustrates an aggregate operation using\n" +
            "     * {@link Stream} and {@link IntStream}:\n" +
            "     *\n" +
            "     * <pre>{@code\n" +
            "     *     int sum = widgets.stream()\n" +
            "     *                      .filter(w -> w.getColor() == RED)\n" +
            "     *                      .mapToInt(w -> w.getWeight())\n" +
            "     *                      .sum();\n" +
            "     * }</pre>\n" +
            "     *";


    public static void main(String[] args) {

        Stream<String> stream = Stream.of(StreamExample32.str);
        stream = stream.flatMap(e -> Arrays.stream(e.split("\\s")));
        Map<String, Integer> collect = stream.collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 1;
            }
        }, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer s1, Integer s2) {
                return s1 + s2;
            }
        }, HashMap<String, Integer>::new));
        collect.forEach((k, v) -> System.out.println(k + ":    " + v));
    }

}


