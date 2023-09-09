package stream.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // FORMA MAIS VERBOSA
        Consumer<Integer> numerosImpares = numero -> {
            if (numero % 2 != 0){
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(numerosImpares);

        //FORMA MENOS VERBOSA
        numeros.forEach(numero -> {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        });
    }
}
