import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample42 {
    public static void main(String[] args) throws IOException {
        /*
         * ID 등장횟수 : 보낸사람 , 받는 사람을 flatMap 수행, GroupBy 수행
         *
         * */
        getEmaildata emaildata = new getEmaildata();
        ArrayList<Email> data = emaildata.getData();

        Map<Integer, Long> collect = data.stream().parallel().flatMap(e -> Stream.of(e.getSrc(), e.getDst()))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        collect.forEach((k, v) -> System.out.println(k + "->" + v));

    }

}


