import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample24 {
    public static void main(String[] args) {

        /*
        collect
        
         * */
        Stream<String> s = Stream.of("Hello", "KMOOC", "Data", "Engineering");

        //ArrayList<String> 으로 모아서 반환해주는 프로그램

//        Supplier f; -> 매개변수 없이 컨테이너를 반환
        ArrayList<String> list = s.collect(() -> new ArrayList<String>(), (container, e) -> container.add(e), (c1, c2) -> {
        });

        System.out.println(list);

    }

}


