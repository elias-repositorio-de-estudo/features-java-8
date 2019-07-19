package firstLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four","five");

        Predicate<String> p1 = Predicate.isEqual("one");
        Predicate<String> p2 = Predicate.isEqual("two");

        List<String> list = new ArrayList<>();

        stream
                .peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(list::add);

        System.out.println(list);
    }
}
