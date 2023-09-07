package set.convidado;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var conjuntoConvidado = new ConjuntoConvidado();
        conjuntoConvidado.adicionaConvidado("Kevin", 123456);
        conjuntoConvidado.adicionaConvidado("Kevin Avanade", 123456);
        conjuntoConvidado.adicionaConvidado("Kevin Trabalho", 222222);
        conjuntoConvidado.adicionaConvidado("Joana", 678910);

        conjuntoConvidado.exibirConvidados();

        System.out.println(conjuntoConvidado.contarConvidados());

        conjuntoConvidado.removerConvidado(222222);

        conjuntoConvidado.exibirConvidados();
    }
}