import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample41 {
    
    /*
     *최소 사람 ID 구하기 : 보낸사람 , 받는사람 flatMap -> 최솟값 minBy
     *최대 사람 ID 구하기 : 보낸사람 , 받는사람 flatMap -> 최댓값 maxBy
     * */
    public static void main(String[] args) throws IOException {
        getEmaildata emaildata = new getEmaildata();
        ArrayList<Email> data = emaildata.getData();
        Integer integer = data.stream().parallel().flatMap(e -> Stream.of(e.getSrc(), e.getDst()))
                .collect(Collectors.maxBy((e1, e2) -> {
                    if (e1 > e2) return 1;
                    else if (e1 == e2) return 0;
                    else return -1;
                })).get();
        System.out.println("integer = " + integer);


        //HashSet 으로 collect

    }

}


