package stream.binaryoperator;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int total = numeros.stream().reduce(0, Integer::sum);

        System.out.println(total);
    }
}