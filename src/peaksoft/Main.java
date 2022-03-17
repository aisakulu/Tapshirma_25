package peaksoft;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        set2.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        Set<Integer> symmetric = symmetricDifference(set,set2);
        symmetric.forEach(x -> System.out.print(x + " "));


    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet =new HashSet<>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        return newSet;
    }
}
