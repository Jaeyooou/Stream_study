import java.util.stream.Stream;

public class StreamExample20 {
    public static void main(String[] args) {
        /*
         * 질문해야함 이럴거면 왜 min 과 max 가 나뉘어져 있는지 -> Comparator 는 논리적으로 작성하는것 -> 논리적으로 작성한다면, min 과 max 는 잘 반환될것이다.
         * */
//        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).count());
//        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).min((e1, e2) -> {
//            if (e1 < e2) return -1;
//            else if (e1 == e2) return 0;
//            else return 1;
//
//        }).get());
//        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).max((e1, e2) -> {
//            if (e1 < e2) return -1;
//            else if (e1 == e2) return 0;
//            else return 1;
//
//        }).get());
//        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).findFirst());
        System.out.println(Stream.of(2, 5, 9, 3, 6, 1).min((e1, e2) -> {
            if (e1 < e2) return -1;
            else if (e1 == e2) return 0;
            else return 1;
        }).get());
    }

}


