package stream.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> linguagens = Arrays.asList("Java", "Javascript", "Python", "Kotlin", "Typescript");

        linguagens
                .stream()
                .filter(linguagem -> linguagem.length() > 6)
                .forEach(System.out::println);
    }
}
