package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListConceptsA {
    public static void main(String[] args) {
        List<Integer> listB = IntStream.range(1,21).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(listB.get(14));
        System.out.println(listB.indexOf(20));
        listB.remove(15);
        System.out.println(listB.contains(16));
        listB.retainAll(List.of(2,4,6,8));
        System.out.println(listB);
        listB.sort(Comparator.reverseOrder());
        System.out.println(listB);
        listB.clear();
        System.out.println(listB.isEmpty());
    }
}
