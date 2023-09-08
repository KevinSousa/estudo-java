package map.evento;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    void adicionarEvento(LocalDate date, String nomeEvento, String atracao) {
        this.eventos.put(date, new Evento(nomeEvento, atracao));
    }

    void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        System.out.println(eventosOrdenados);
    }

    void obterProximoEvento() {
        LocalDate agora = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);

        for(Map.Entry<LocalDate, Evento> evento : eventosOrdenados.entrySet()){
            if(evento.getKey().isEqual(agora) || evento.getKey().isAfter(agora)){
                System.out.println("O Próximo evento será: " + evento.getValue().getNomeEvento() + " será na data " + evento.getKey());
                break;
            }
        }

    }

}
