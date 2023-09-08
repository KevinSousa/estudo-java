package map.evento;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        var agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 9), "CIRCO", "Palhaço");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 9), "SHOW", "CANTOR");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 11), "ARTE", "PINTURA");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 12), "RESTAURANTE", "CHEF");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 13), "APRESENTAÇÃO", "GUITARRISTA");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
