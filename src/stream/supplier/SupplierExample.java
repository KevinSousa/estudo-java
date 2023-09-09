package stream.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {

//        Supplier<String> saudacao = () -> "Olá Mundo!!";
        List<String> listaSaudacoes = Stream.generate(() -> "Olá Mundo!!").limit(5).toList();
        listaSaudacoes.forEach(System.out::println);
    }
}
