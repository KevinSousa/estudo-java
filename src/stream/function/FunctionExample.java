package stream.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FunctionExample {
    public static void main(String[] args) {

        List<Integer> triplo = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> integerStream = triplo.stream().map(numero -> numero * 3).toList();
        integerStream.forEach(System.out::println);
    }
}
