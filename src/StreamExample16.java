import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample16 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);
        //sorted: 정렬하는 method

        List<Integer> collect = s.sorted().collect(Collectors.toList());
        System.out.println("collect = " + collect);
        Stream<Email> s1 = Stream.of(new Email(1, 5), new Email(2, 4), new Email(3, 3));
//        List<Email> collect1 = s1.sorted(new Comparator<Email>() {
//            @Override
//            public int compare(Email o1, Email o2) {
//                    if(o1.getDst() > o2.getDst())
//                        return 1;
//                    else if (o1.getDst() == o2.getDst()) {
//                        return 0;
//                    }else
//                        return -1;
//
//            }
//        }).collect(Collectors.toList());
        List<Email> emails = Stream.of(new Email(1, 5), new Email(2, 4), new Email(3, 3)).sorted((o1,o2)->{
            if(o1.getDst() > o2.getDst())   return 1;
            else if(o1.getDst() == o2.getDst()) return 0;
            else    return -1;
        }).collect(Collectors.toList());

        System.out.println("collect1 = " + emails);
    }

}


