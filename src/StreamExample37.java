import java.util.ArrayList;

public class StreamExample37 {


    public static void main(String[] args) {

        /*
         *parallel Stream 순서없음
         * */

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        list.stream().parallel().sorted().forEach(e -> System.out.println(e));
    }

}


