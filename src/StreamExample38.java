import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample38 {


    public static void main(String[] args) {

        /*
         *parallel Stream 성능 차이
         * 1억개의 Integer
         * e %10 != 0 을 필터링 (10% 필터링)
         * e%10 으로 Grouping 하여 SummingInt 수행
         * Stream vs parallel stream
         *  */

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            arrayList.add(i);
        }
        long pre = System.currentTimeMillis();
        System.out.println(arrayList.stream().filter(e -> e % 10 != 0).collect(Collectors.groupingBy(e -> e % 10, Collectors.summingInt(e -> e))));
        System.out.println(System.currentTimeMillis() - pre);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            arrayList2.add(i);
        }
        pre = System.currentTimeMillis();
        System.out.println(arrayList2.stream().parallel().filter(e -> e % 10 != 0).collect(Collectors.groupingBy(e -> e % 10, Collectors.summingInt(e -> e))));
        System.out.println(System.currentTimeMillis() - pre);
        
    }

}


