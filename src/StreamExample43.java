import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample43 {
    public static void main(String[] args) throws IOException {
        /*
         * 각 보낸 사람에 대한 받는 사람들
         *
         * */
        getEmaildata emaildata = new getEmaildata();
        ArrayList<Email> data = emaildata.getData();

        Map<Integer, List<Integer>> collect = data.stream().collect(Collectors.groupingBy(e -> e.getSrc(), Collectors.mapping(e -> e.getDst(), Collectors.toList())));
        collect.forEach((k, v) -> {
            System.out.println(k + "-> " + v);
            
        });

    }

}


